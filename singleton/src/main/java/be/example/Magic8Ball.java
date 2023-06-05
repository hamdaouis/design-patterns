package be.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Magic8Ball {
    INSTANCE;

    private final List<String> zinnen = new ArrayList<>(List.of("Zoals ik het zie, ja.",
            "Het is zeker.",
            "Hoogst waarschijnlijk.",
            "Ziet er goed uit.",
            "Zonder twijfel.",
            "Ja.",
            "Zeker.",
            "Je mag er op rekenen.",
            "Vraag dit later nog eens.",
            "Dit wil je niet weten.",
            "Ik kan dit nu niet voorspellen.",
            "Concentreer je en stel je vraag opnieuw.",
            "Je moet er niet op rekenen.",
            "Nee.",
            "Ziet er niet goed uit.",
            "Zeer twijfelachtig."));
    private int vorigAntwoordIndex = -1;
    void schud(String vraag) {
        var random = new Random();
        var index = random.nextInt(zinnen.size());
        System.out.println("Vraag: " + vraag);
        while (vorigAntwoordIndex == index){
            index = random.nextInt(zinnen.size());
        }
        vorigAntwoordIndex = index;
        var zin = zinnen.get(index);
        System.out.println("Antwoord: "+ zin);
    }
}
