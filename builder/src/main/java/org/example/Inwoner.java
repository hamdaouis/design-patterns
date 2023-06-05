package org.example;

class Inwoner {
    private final String voornaam;
    private final String familienaam;
    private final int aantalKinderen;
    private final int aantalKerenVerhuisd;
    private final boolean gehuwd;
    private final boolean gescheiden;

    private Inwoner(String voornaam, String familienaam, int aantalKinderen,
            int aantalKerenVerhuisd, boolean gehuwd, boolean gescheiden) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
        this.aantalKerenVerhuisd = aantalKerenVerhuisd;
        this.gehuwd = gehuwd;
        this.gescheiden = gescheiden;
    }

    @Override
    public String toString() {
        return voornaam + ' ' + familienaam;
    }

    public static class InwonerBuilder {
        private String voornaam;
        private String familienaam;
        private int aantalKinderen;
        private int aantalKerenVerhuisd;
        private boolean gehuwd;
        private boolean gescheiden;

        InwonerBuilder metVoornaam(String voornaam) {
            this.voornaam = voornaam;
            return this;
        }

        InwonerBuilder metFamilienaam(String familienaam) {
            this.familienaam = familienaam;
            return this;
        }

        InwonerBuilder metAantalKinderen(int aantalKinderen) {
            this.aantalKinderen = aantalKinderen;
            return this;
        }

        InwonerBuilder metAantalKerenVerhuisd(int aantalKerenVerhuisd) {
            this.aantalKerenVerhuisd = aantalKerenVerhuisd;
            return this;
        }

        InwonerBuilder metGehuwd(boolean gehuwd) {
            this.gehuwd = gehuwd;
            return this;
        }

        InwonerBuilder metGescheiden(boolean gescheiden) {
            this.gescheiden = gescheiden;
            return this;
        }

        Inwoner maakInwoner() {
            return new Inwoner(voornaam, familienaam, aantalKinderen,
                    aantalKerenVerhuisd, gehuwd, gescheiden);
        }
    }

}