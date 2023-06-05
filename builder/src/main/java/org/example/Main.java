package org.example;

public class Main {
    public static void main(String[] args) {
        var builder = new Inwoner.InwonerBuilder();
        var inwoner = builder.metVoornaam("Olivier")
                .metFamilienaam("Gerard")
                .metAantalKinderen(1)
                .metAantalKerenVerhuisd(3)
                .metGehuwd(true)
                .metGescheiden(false)
                .maakInwoner();
        System.out.println(inwoner);
    }
}