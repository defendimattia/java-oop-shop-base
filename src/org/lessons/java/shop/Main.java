package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product spazzola = new Product("spazzola", "una bella spazzola per pettinarsi", new BigDecimal("9.99"));

        System.out.println(spazzola.showBasePrice());
        System.out.println(spazzola.showFullPrice());
        System.out.println(spazzola.showFullName());
    }
}
