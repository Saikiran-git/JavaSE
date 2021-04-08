package com.kiran.java.mockito.HandsOnLMSRefactoring;

import java.util.StringJoiner;

public class Book {
    private String bookId;
    private String bookTitle;
    private String authorName;
    private String publisherName;

    public Book(String bookId, String bookTitle, String authorName, String publisherName) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publisherName = publisherName;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookId() {
        return bookId;
    }
    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
    public String getAuthorName() {
        return authorName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
    public String getPublisherName() {
        return publisherName;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner("\n");

        sj.add("Book ID:" + bookId);
        sj.add("Book Title:" + bookTitle);
        sj.add("Author Name:" + authorName);
        sj.add("Publisher Name:" + publisherName);

        return sj.toString();
    }
}
