package com.example.springlearning.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Product {

    private int id;
    private String title;
    private int cost;

    public int getId() {
        return id;
    }

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



}
