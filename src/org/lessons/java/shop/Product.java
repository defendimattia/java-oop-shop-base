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

    public void setName(String newName) {
        if (newName != null && !newName.isBlank()) {
            this.name = newName;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String newDescription) {
        if (newDescription != null && !newDescription.isBlank()) {
            this.description = newDescription;
        }
    }

    public BigDecimal getBasePrice() {
        return this.price;
    }

    public void setBasePrice(BigDecimal newBasePrice) {
        if (newBasePrice != null && newBasePrice.compareTo(BigDecimal.ZERO) > 0) {
            this.price = newBasePrice;
        }
    }

    public BigDecimal getIva() {
        if (price != null && iva != null) {
            return this.iva;
        }

        return null;
    }

    public void setIva(BigDecimal newIva) {
        if (newIva != null && newIva.compareTo(BigDecimal.ZERO) >= 0) {
            this.iva = newIva;
        }
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
