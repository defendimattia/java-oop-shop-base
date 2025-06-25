package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
     private String code;
     private String name;
     private String description;
     private BigDecimal price;
     private BigDecimal iva;

    public Product(String name, String description, BigDecimal price, BigDecimal iva) {
        Random randomNum = new Random();
        this.code = String.format("%06d", randomNum.nextInt(1000000));
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public Product(String name) {
        Random randomNum = new Random();
        this.code = String.format("%06d", randomNum.nextInt(1000000));
        this.name = name;
        this.description = "Nessuna descrizione inserita";
        this.price = new BigDecimal(0);
        this.iva = new BigDecimal(0);
    }

    BigDecimal showBasePrice() {
        return this.price;
    }

    BigDecimal showFullPrice() {
        if (price != null) {
            return price.add(price.multiply(iva).setScale(2, RoundingMode.DOWN));
        }

        return null;
    }

    String showFullName() {
        return code + "-" + name;
    }
}
