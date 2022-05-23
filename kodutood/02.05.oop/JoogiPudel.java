public class JoogiPudel {
    private double maht;
    private String pudelitüüp;
    private double erikaal;
    private double taaraMaksumus;

    public double getMaht() {
        return maht;
    }

    public void setMaht(double maht) {
        this.maht = maht;
    }

    public String getPudelitüüp() {
        return pudelitüüp;
    }

    public void setPudelitüüp(String pudelitüüp) {
        this.pudelitüüp = pudelitüüp;
    }

    public double getErikaal() {
        return erikaal;
    }

    public void setErikaal(double erikaal) {
        this.erikaal = erikaal;
    }

    public double getTaaraMaksumus() {
        return taaraMaksumus;
    }

    public void setTaaraMaksumus(double taaraMaksumus) {
        this.taaraMaksumus = taaraMaksumus;
    }


    public JoogiPudel(double volume, String typeOfBottle, double mass, double priceOfPackage) {
        maht = volume;
        pudelitüüp = typeOfBottle;
        erikaal = mass;
        taaraMaksumus = priceOfPackage;
    }
}