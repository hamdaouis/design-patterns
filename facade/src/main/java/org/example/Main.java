package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var persoon = new Persoon(
                new Beroepsinkomsten(BigDecimal.valueOf(3_000)),
                new Rekening());
        var verstrekker = new LeningVerstrekker();
        System.out.println("Voor storting:");
        if (verstrekker.isLeningGoedgekeurd(persoon)) {
            System.out.println("Goedgekeurd");
        } else {
            System.out.println("Afgekeurd");
        }
        // Storting
        persoon.getRekening().storten(BigDecimal.valueOf(500));
        System.out.println("Na storting:");
        if (verstrekker.isLeningGoedgekeurd(persoon)) {
            System.out.println("Goedgekeurd");
        } else {
            System.out.println("Afgekeurd");
        }
    }
}