/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Comparator;

/**
 *
 * @author samsung
 */
public class NameComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2){
        return book1.getName().compareTo(book2.getName());
    }
    
}
