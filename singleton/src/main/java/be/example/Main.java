package be.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Stel je vraag: ");
        var input = scanner.nextLine();
        Magic8Ball.INSTANCE.schud(input);
    }
}
