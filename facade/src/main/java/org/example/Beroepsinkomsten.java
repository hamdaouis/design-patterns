package org.example;

import java.math.BigDecimal;

class Beroepsinkomsten {
    private BigDecimal maandWedde;

    Beroepsinkomsten(BigDecimal maandWedde) {
        this.maandWedde = maandWedde;
    }

    public BigDecimal getMaandWedde() {
        return maandWedde;
    }
}