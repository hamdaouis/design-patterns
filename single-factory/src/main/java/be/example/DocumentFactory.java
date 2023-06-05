package be.example;

public class DocumentFactory {
    Document open(String bestandsnaam) {
        int extensieBeginIndex = bestandsnaam.lastIndexOf(".");
        var extensie = bestandsnaam.substring(extensieBeginIndex + 1);
        return switch (extensie) {
            case "docx" -> new Tekst(bestandsnaam);
            case "xlsx" -> new Rekenblad(bestandsnaam);
            case "pptx" -> new Presentatie(bestandsnaam);
            default -> throw new IllegalArgumentException();
        };
    }
}
