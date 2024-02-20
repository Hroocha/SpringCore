package com.example.springlearning.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    Cart cart;

    @Autowired
    ProductService productService;

    public void order(Cart cart){
        productService.printAll(cart.getListOfProducts());
    }

}
