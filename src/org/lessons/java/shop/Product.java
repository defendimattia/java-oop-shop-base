package org.lessons.java.shop;

import java.util.Random;

public class Product {
    String code;
    String name;
    String description;
    float price;
    int iva;

    Product() {
        Random randomNum = new Random();
        this.code = String.format("%06d",randomNum.nextInt(1000000));
    }
}
