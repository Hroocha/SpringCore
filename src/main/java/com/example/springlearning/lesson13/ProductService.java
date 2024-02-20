package com.example.springlearning.lesson13;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    private List<Product> listOfProducts;

    @PostConstruct
    public void preparation(){
        listOfProducts = new ArrayList<>(10);
        int [] cost = {132,333,365,255,256,355,357,322,456,784};
        String [] products = {"milk", "bread", "lemonade", "fish", "meat", "chips", "chocolate", "beer", "tomatoes", "potatoes"};
        for (int i = 0; i < 10; i++) {
            listOfProducts.add(new Product(i+1, products[i], cost[i] ));
        }
    }

    public Product findByTitle(String title){
        for (Product p:listOfProducts) {
            if(p.getTitle().equals(title)){
                return p;
            }
            // или просто в одну строку: return listOfProducts.stream().filter(product -> product.getTitle().equals(title)).findAny().get();
        }
        System.out.println("This product is not exist");
        return null;
    }

    public void printAll(List<Product> listOfProducts){
        for (Product p: listOfProducts) {
            System.out.println(p.getTitle() + " " + p.getCost());
        }
    }

}
