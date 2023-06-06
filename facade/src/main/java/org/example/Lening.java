package org.example;

import java.math.BigDecimal;
class Lening {
    private final BigDecimal bedrag;
    Lening(BigDecimal bedrag) {
        this.bedrag = bedrag;
    }

    public BigDecimal getBedrag() {
        return bedrag;
    }
}
