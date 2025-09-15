package com.example.minilibrary;

public class MiniLibraryApp {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Alice");

        librarian.registerBook("Java Basics", "John Smith", 2020);
        librarian.registerBook(new Book("OOP Principles", "Jane Doe", 2021));
        librarian.registerBook("Design Patterns", "Gamma", 1995);

        Library.showBooks();

        User bob = new User("Bob");
        User kate = new User("Kate");

        bob.borrowBook(Library.getBooks().get(0)); // Bob бере першу книгу
        kate.borrowBook(Library.getBooks().get(0)); // Kate пробує взяти зайняту
        kate.borrowBook(Library.getBooks().get(1)); // Kate бере іншу

        bob.returnBook(Library.getBooks().get(0));

        Library.showBooks();
        Library.showActions();
    }
}
