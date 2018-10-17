package GroupBookApp;

import java.util.ArrayList;

public class Author {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private ArrayList<Book>allBook;

    public Author() {
        allBook = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Book> getAllBook() {
        return allBook;
    }

    public void setAllBook(ArrayList<Book> allBook) {
        this.allBook = allBook;
    }
    public  void addBooks(Book book){
        allBook.add(book);
    }
}
