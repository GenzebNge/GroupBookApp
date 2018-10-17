package GroupBookApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner userInput = new Scanner(System.in);
        ArrayList<Book> allBook = new ArrayList<>();
        ArrayList<Author> allAuthor = new ArrayList<>();
        int choice = 0;

        do {
            System.out.println("Select options from the menu: \n1. Create book \n2. List book \n3. create Author \n4. List Book with Author \n5. List of Author with books \n6. Quite");
            choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice) {
                case 1:
                    String newBook = "";
                    do {
                        Book aBook = new Book();
                        System.out.println("Create book");
                        System.out.println("Enter title");
                        String title = userInput.nextLine();
                        aBook.setTitle(title);
                        System.out.println("Enter ISBN");
                        String ISBN = userInput.nextLine();
                        aBook.setISBN(ISBN);
                        System.out.println("Do you want add other book");
                        newBook = userInput.nextLine();
                        allBook.add(aBook);

                    } while (newBook.equalsIgnoreCase("yes"));

                    break;
                case 2:
                    System.out.println("List of Books ");
                    for (Book eachBook : allBook) {
                        System.out.println("title:" + eachBook.getTitle() + "\nISBN:" + eachBook.getISBN());
                    }

                    break;

                case 3:
                    Author author = new Author();
                    String firstName, lastName;
                            String option ="";

                    System.out.println("Enter Author");

                    System.out.println("Enter first name");
                    firstName = userInput.nextLine();
                    author.setFirstName(firstName);

                    System.out.println("Enter last name");
                    lastName = userInput.nextLine();
                    author.setLastName(lastName);
                   // allAuthor.add(author);

                    do{
                        Book aBook = new Book();
                        System.out.println("Create book");
                        System.out.println("Enter title");
                        String title = userInput.nextLine();
                        aBook.setTitle(title);
                        System.out.println("Enter ISBN");
                        String ISBN = userInput.nextLine();
                        aBook.setISBN(ISBN);
                        System.out.println("Do you want to add more books? yse/no");
                        option = userInput.nextLine();
                        allBook.add(aBook);
                        author.addBooks(aBook);

                    }while(option.equalsIgnoreCase("yes"));

                    allAuthor.add(author);

                    break;
            case 4:
                System.out.println("List all Books with their Author");
                for(Author author1:allAuthor){
                    System.out.println("First Name :"+ author1.getFirstName()+ "\nLast Name: "+ author1.getLastName()+ "\nBooks");
                    for(Book book: author1.getAllBook()){
                        System.out.println("Title : "+book.getTitle()+ "ISBN :"+ book.getISBN());
                    }

                }

                break;
           case 6:
              System.out.println("Quit");
                      break;

                default:
                    System.out.println("Do not finished");
                    break;
            }
        } while (choice != 6);



    }
}
