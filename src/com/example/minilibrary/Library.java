package com.example.minilibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static final List<Book> books = new ArrayList<>();
    private static final List<String> actions = new ArrayList<>();
    private static int totalBooks = 0;

    public static void addBook(Book book) {
        books.add(book);
        totalBooks++;
    }

    public static Book findByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) return b;
        }
        return null;
    }

    public static void registerAction(User user, Book book, String action) {
        String log = user.getName() + " " + action + " '" + book.getTitle() + "'";
        actions.add(log);
    }

    public static void showBooks() {
        System.out.println("\n=== Books in Library ===");
        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("Total books: " + totalBooks);
    }

    public static void showActions() {
        System.out.println("\n=== Actions Log ===");
        for (String act : actions) {
            System.out.println(act);
        }
    }

    public static List<Book> getBooks() {
        return books;
    }
}