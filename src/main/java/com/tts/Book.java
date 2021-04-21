package com.tts;

public class Book {

    String title;
    boolean borrowed;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }




    // Marks the book as rented
    public void rented() {
        this.borrowed = true;
    }

    // Marks the book as not rented
    public void returned() {
        this.borrowed = false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {
        if(borrowed == true){
            return true;
        } else {
            return false;
        }
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }


}
