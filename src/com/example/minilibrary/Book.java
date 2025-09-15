package com.example.minilibrary;

public class Book {
    private final String title;
    private final String author;
    private final int year;
    private boolean available;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = true; // спочатку книга доступна
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return title + " - author - " + author + ", year - " + year +
                (available ? "Available" : "Borrowed");
    }
}
