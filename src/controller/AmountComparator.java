/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import model.Book;

/**
 *
 * @author samsung
 */
public class AmountComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2){
        return book1.getAmount() - book2.getAmount();
    }
    
}
