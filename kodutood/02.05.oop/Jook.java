public class Jook {
    private String nimetus;
    private double liitriOmahind;
    private double erikaal;

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double getLiitriOmahind() {
        return liitriOmahind;
    }

    public void setLiitriOmahind(double liitriOmahind) {
        this.liitriOmahind = liitriOmahind;
    }

    public double getErikaal() {
        return erikaal;
    }

    public void setErikaal(double erikaal) {
        this.erikaal = erikaal;
    }

    public Jook(String name, double pricePerLiter, double mass) {
        nimetus = name;
        liitriOmahind = pricePerLiter;
        erikaal = mass;
    }
}