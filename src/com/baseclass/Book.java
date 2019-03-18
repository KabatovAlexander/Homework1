package com.baseclass;

import java.util.ArrayList;
import java.util.Objects;


public class Book {
    private String name;
    private ArrayList <Author> authors;
    private double price;
    private int qty;



    public Book (String name, ArrayList <Author> authors, double price) {
        this(name, authors, price, 0);
    }

    public Book (String name, ArrayList <Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;

    }




    public String getNameBook() {
        return name;
    }


    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorToString = "";
        for (int i = 0 ; i < authors.size(); i++) {
            authorToString += " Authors[name = " + authors.get(i).getName() + ", email = " + authors.get(i).getEmail() + ", gender = " + authors.get(i).getGender()+"]";
        }
        return "Book[ " + "name = '" + name +  "', authors = [" + authorToString + "]" + ", price=" + price + ", qty=" + qty + ']';
    }
    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.size() ; i++) {
            authorNames += authors.get(i).getName() + ", ";
        }
        return authorNames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && qty == book.qty && Objects.equals(name, book.name) && Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authors, price, qty);
    }
}
