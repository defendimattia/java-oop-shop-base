package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product spazzola = new Product("spazzola", "una bella spazzola per pettinarsi", new BigDecimal("9.99"),
                new BigDecimal(0.22));

        System.out.println(spazzola.getBasePrice());
        System.out.println(spazzola.getFullPrice());
        System.out.println(spazzola.getFullName());
    }
}
