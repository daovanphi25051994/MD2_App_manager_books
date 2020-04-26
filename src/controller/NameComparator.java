package controller;

import java.util.Comparator;
import model.Book;

public class NameComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getName().compareTo(book2.getName());
    }

}
