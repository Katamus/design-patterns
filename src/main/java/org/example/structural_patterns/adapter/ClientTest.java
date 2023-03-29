package org.example.structural_patterns.adapter;

public class ClientTest {
    public static void main(String[] args) {
        Book book;
        book = new AdapterBook(new SimpleBook("Refactoring", "Martin Fowler"));
        System.out.println(book.getTitleAndAuthor());
    }
}
