package be.example;

public class Main {
    public static void main(String[] args) {
        var bestand = "tekstbestand.docx";
        var factory = new DocumentFactory();
        var document = factory.open(bestand);
        document.print();
        document.printPreview();
    }
}
