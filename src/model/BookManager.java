/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author samsung
 */
public class BookManager {
   private static BookManager bookManager;
   private static final ArrayList<Book> listBook = new ArrayList<>();
   
   private BookManager(){}
   
   public static BookManager getBookManager(){
       if(bookManager == null){
           bookManager = new BookManager();
       }
       return bookManager;
   }
   
   public boolean addBook(Book book){
       if(book == null){
           return false;
       }
       listBook.add(book);
       return true;
   }
   
    public boolean removeBook(Book book){
       if(book == null){
           return false;
       }
       for(Book myBook : listBook){
           if(myBook.equals(book)){
               listBook.remove(book);
               return true;
           }
       }
     
       return false;
   }
    public ArrayList<Book> getListBooks(){
        return listBook;
    }
}
