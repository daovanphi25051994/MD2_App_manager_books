package controller;

import java.util.Comparator;
import model.Book;

public class AmountComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAmount() - book2.getAmount();
    }

}
