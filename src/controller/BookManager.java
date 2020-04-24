/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Book;

/**
 *
 * @author samsung
 */
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
            if (book.getName().equals(nameBook)) {
                return true;
            }
        }
        return false;
    }

}
