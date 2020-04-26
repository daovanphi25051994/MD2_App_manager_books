package controller;

import java.util.Comparator;
import model.Book;

public class AuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
