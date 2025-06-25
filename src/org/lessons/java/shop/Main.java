package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Product spazzola = new Product("spazzola", "una bella spazzola per pettinarsi", 9.99f);

        spazzola.showBasePrice();
        spazzola.showFullPrice();
        spazzola.showFullName();
    }
}
