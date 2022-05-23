public class Joogivaat {
    private String nimetus;
    private double joogiKogusLitris;

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getJoogiKogusLitris() {
        return joogiKogusLitris;
    }

    public void setJoogiKogusLitris(double joogiKogusLitris) {
        this.joogiKogusLitris = joogiKogusLitris;
    }

    public Joogivaat(String drinkName, double drinkAmountLiters) {
        nimetus = drinkName;
        joogiKogusLitris = drinkAmountLiters;
    }



}