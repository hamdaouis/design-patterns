package be.example;

public class Tekst extends Document{
    public Tekst(String bestandsnaam) {
        super(bestandsnaam);
    }
    @Override
    void print() {
        System.out.println("een afdruk van een tekst");
    }
    @Override
    void printPreview() {
        System.out.println("een afdrukvoorbeeld van een tekst");
    }
}
