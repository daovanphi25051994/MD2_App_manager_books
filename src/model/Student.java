/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author samsung
 */
public class Student implements Serializable {

    private String studentID;
    private String name;
    private ArrayList<String> borrowBooks = new ArrayList<>();

    public Student() {

    }

    public Student(String ID, String name) {
        this.studentID = ID;
        this.name = name;
    }

    public String getID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBorrowBooks() {
        return borrowBooks;
    }

    public boolean borrowBook(String nameBook) {
        for (String myBook : borrowBooks) {
            if (myBook.equals(nameBook)) {
                return false;
            }
        }
        borrowBooks.add(nameBook);
        return true;
    }

    public boolean giveBackBook(String nameBook) {
        for (String myBook : borrowBooks) {
            if (myBook.equals(nameBook)) {
                borrowBooks.remove(nameBook);
                return true;
            }
        }
        return false;
    }

    public void setID(String ID) {
        this.studentID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentID : " + this.studentID
                + " ; name : " + this.name;
    }
}
