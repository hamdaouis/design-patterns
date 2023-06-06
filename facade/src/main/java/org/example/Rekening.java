package org.example;

import java.math.BigDecimal;
class Rekening {
    private BigDecimal saldo = BigDecimal.ZERO;
    void storten(BigDecimal bedrag) {
        saldo = saldo.add(bedrag);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}