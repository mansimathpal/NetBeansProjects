package com.learning.collection;

public class Book {
    private int id;
    private String title;
    private String name;
    private double prices;
    private int pages;
    
    public Book(){
    }

    public Book(int id, String title, String name, double prices, int pages) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.prices = prices;
        this.pages = pages;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", name=" + name + ", prices=" + prices + ", pages=" + pages + '}';
    }
    
    
}
