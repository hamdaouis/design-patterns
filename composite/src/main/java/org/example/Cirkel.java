package org.example;

class Cirkel implements Figuur {
    private final double straal;
    Cirkel(double straal) {
        this.straal = straal;
    }
    @Override
    public double getOppervlakte() {
        return straal * straal * Math.PI;
    }
}