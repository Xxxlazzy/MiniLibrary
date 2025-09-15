package com.example.minilibrary;

public class Librarian extends User {
    public Librarian(String name) {
        super(name);
    }

    public void registerBook(String title, String author, int year) {
        Book newBook = new Book(title, author, year);
        Library.addBook(newBook);
    }

    public void registerBook(Book book) {
        Library.addBook(book);
    }
}