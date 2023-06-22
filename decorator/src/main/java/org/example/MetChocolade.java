package org.example;

import java.math.BigDecimal;

class MetChocolade extends KoffieDecorator {
    MetChocolade(Koffie gedecoreerdeKoffie) {
        super(gedecoreerdeKoffie);
    }
    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }
    @Override
    public String getBereidingswijze() {
        return gedecoreerdeKoffie.getBereidingswijze()
        + ", schilfer de chocolade, voeg de schilfers toe";
    }
}