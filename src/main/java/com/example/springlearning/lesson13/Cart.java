package com.example.springlearning.lesson13;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {
    private List<Product> listOfProducts;

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void add(Product product){
        listOfProducts.add(product);
    }

    @PostConstruct
    public void preparation() {
        listOfProducts = new ArrayList<>(100);
    }
}
