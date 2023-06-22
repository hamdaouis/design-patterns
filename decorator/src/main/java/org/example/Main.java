package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Koffie koffie = new EenvoudigeKoffie();
        var scanner = new Scanner(System.in);
        System.out.print("Melk (j/n):");
        if ("j".equals(scanner.next())) {
            koffie = new MetMelk(koffie);
        }
        System.out.print("Chocolade (j/n):");
        if ("j".equals(scanner.next())) {
            koffie = new MetChocolade(koffie);
        }
        System.out.println(koffie.getKost());
        System.out.println(koffie.getBereidingswijze());
    }
}