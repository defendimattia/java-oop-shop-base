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

    float showBasePrice() {
        System.out.println(this.price);
        return this.price;
    }

    float showFullPrice() {
        float fullPrice = this.price + (this.price * iva / 100);
        fullPrice = Math.round(fullPrice * 100) / 100f;
        System.out.println(fullPrice);
        return fullPrice;
    }

    String showFullName() {
        String fullName = code + "-" + name;
        System.out.println(fullName);
        return fullName;
    }
}
