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

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getBasePrice() {
        return this.price;
    }

    public BigDecimal getIva() {
        if (price != null && iva != null) {
            return this.iva;
        }

        return null;
    }

    public BigDecimal getFullPrice() {
        if (price != null && iva != null) {
            return price.add(price.multiply(iva).setScale(2, RoundingMode.DOWN));
        }

        return null;
    }

    public String getFullName() {
        return code + "-" + name;
    }
}
