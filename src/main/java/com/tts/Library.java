package com.tts;
import java.util.*;

public class Library {

    // Add the missing implementation to this class

    String libraryAddress;
    ArrayList<Book> books;



    public Library(String address) {
        this.libraryAddress = address;
        this.books = new ArrayList();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void printAddress() {
        System.out.println(libraryAddress);
    }





    public String borrowBook(String bookTitle) {
        for(int i = 0; i < this.books.size(); ++i) {
            Book libraryBook = this.books.get(i);
            String libraryBookTitle = libraryBook.getTitle();
            if (libraryBookTitle.equals(bookTitle)) {
                if (!libraryBook.isBorrowed()) {
                    libraryBook.rented();
                    System.out.println("We have " + libraryBookTitle + ", and you have successfully borrowed it!");
                    return null;
                }

                System.out.println("Someone else has " + libraryBookTitle + " right now :(");
                return null;
            }
        }

        System.out.println("Your book was not found in our system, sorry.");
        return null;
    }


    public void printAvailableBooks(){
        boolean emptyCatalog = true;


        for (int i = 0; i < this.books.size(); ++i){
            Book catalogBook = this.books.get(i);
            if(!catalogBook.isBorrowed()){
                System.out.println(catalogBook.getTitle());
                emptyCatalog = false;
            }
        }
        if (emptyCatalog){
            System.out.println("No book in catalog");
            }
        }


        public String returnBook(String bookTitle){
            boolean found = false;

            for(int i = 0; i < this.books.size(); ++i) {
                Book libraryBook = this.books.get(i);
                String libraryBookTitle = libraryBook.getTitle();
                if (libraryBookTitle.equals(bookTitle)) {
                    if (libraryBook.isBorrowed()) {
                        libraryBook.returned();
                        System.out.println("You successfully returned " + libraryBookTitle + "!");
                        found = true;
                        break;
                    }

                    if (!found) {
                        System.out.println("Are you sure you got the book from here? It isn't in our system.");
                    }
                }
            }

            System.out.println();
            return null;
        }
}
