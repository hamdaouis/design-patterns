package org.example;

import java.math.BigDecimal;

class MetMelk extends KoffieDecorator {
    MetMelk(Koffie gedecoreerdeKoffie) {
        super(gedecoreerdeKoffie);
    }
    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.ONE);
    }
    @Override
    public String getBereidingswijze() {
        return gedecoreerdeKoffie.getBereidingswijze()
        + ", warm de melk, voeg de melk toe";
    }
}
