/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.webtools.hw4part5.pojo;

/**
 *
 * @author merwinroy
 */
public class Books {
    
    private String isbn;
    private String title;
    private String authors;
    private float price;
    
    public Books(){
    }

    public Books(String isbn, String title, String authors, float price) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
    
}
