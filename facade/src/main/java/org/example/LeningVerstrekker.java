package org.example;

import java.math.BigDecimal;

class LeningVerstrekker {
    boolean isLeningGoedgekeurd(Persoon persoon) {
        return persoon.getBeroepsinkomsten().getMaandWedde()
                       .compareTo(BigDecimal.valueOf(2_500)) >= 0
               && persoon.getRekening().getSaldo().compareTo(BigDecimal.ZERO) > 0
               && persoon.getLeningen().isEmpty();
    }
}