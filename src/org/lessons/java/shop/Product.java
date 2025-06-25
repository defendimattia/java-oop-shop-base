package org.lessons.java.shop;

import java.util.Random;

public class Product {
    String code;
    String name;
    String description;
    float price;
    int iva;

    Product(String name, String description, float price) {
        Random randomNum = new Random();
        this.code = String.format("%06d", randomNum.nextInt(1000000));
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = 22;
    }

    void showBasePrice() {
        System.out.println(this.price);
    }
}
