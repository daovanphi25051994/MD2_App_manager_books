package model;

import java.io.Serializable;

public class Book implements Serializable {

    private String nameBook;
    private String author;
    private int amount;

    public Book() {
    }

    public Book(String nameBook, String author, int amount) {
        this.nameBook = nameBook;
        this.author = author;
        this.amount = amount;
    }

    public String getName() {
        return nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public int getAmount() {
        return amount;
    }

    public void setName(String name) {
        this.nameBook = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Name book : " + this.nameBook
                + " ; Author : " + this.author
                + " ; Amount : " + this.amount;
    }

}
