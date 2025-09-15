package com.example.minilibrary;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String name;
    private final List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            Library.registerAction(this, book, "borrowed");
        } else {
            System.out.println("❌ Book '" + book.getTitle() + "' is not available!");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            Library.registerAction(this, book, "returned");
        } else {
            System.out.println("❌ You don't have this book!");
        }
    }

    @Override
    public String toString() {
        return "User: " + name + ", Borrowed: " + borrowedBooks.size();
    }
}