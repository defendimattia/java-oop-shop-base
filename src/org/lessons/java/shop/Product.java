package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
     public String code;
     public String name;
     public String description;
     public BigDecimal price;
     public BigDecimal iva;

    public Product(String name, String description, BigDecimal price) {
        Random randomNum = new Random();
        this.code = String.format("%06d", randomNum.nextInt(1000000));
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = new BigDecimal("0.22");
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
