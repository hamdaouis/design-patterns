package be.example;

public class Rekenblad extends Document{
    public Rekenblad(String bestandsnaam) {
        super(bestandsnaam);
    }
    @Override
    void print() {
        System.out.println("een afdruk van een rekenblad");
    }
    @Override
    void printPreview() {
        System.out.println("een afdrukvoorbeeld van een rekenblad");
    }
}
