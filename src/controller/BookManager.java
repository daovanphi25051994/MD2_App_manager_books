package controller;

import java.util.ArrayList;
import model.Book;

public class BookManager {

    private static BookManager bookManager;
    public static ArrayList<Book> listBook = new ArrayList<>();

    private BookManager() {
    }

    public static BookManager getBookManager() {
        if (bookManager == null) {
            bookManager = new BookManager();
        }
        return bookManager;
    }

    public boolean addBook(Book book) {
        if (book == null) {
            return false;
        }
        listBook.add(book);
        return true;
    }

    public boolean removeBook(Book book) {
        if (book == null) {
            return false;
        }
        listBook.remove(book);
        return true;
    }

    public boolean isBookExist(String nameBook) {
        for (Book book : listBook) {
            if (book.getName().equalsIgnoreCase(nameBook)) {
                return true;
            }
        }
        return false;
    }

}
