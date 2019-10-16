package com.example.scrollingapplication;

public class Book {

    //unique identifier for the book
    private int bookId;

    //Title of the book
    private String bookTitle;

    //Name of the author
    private String bookAuthor;

    //Summary of the book
    private String bookSummary;

    //Content of the book
    private String bookContent;

    //constructor

    public Book(int bookId, String bookTitle, String bookAuthor, String bookSummary, String bookContent) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookSummary = bookSummary;
        this.bookContent = bookContent;
    }

    //getters

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public String getBookContent() {
        return bookContent;
    }

    //setters

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookName) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }
}
