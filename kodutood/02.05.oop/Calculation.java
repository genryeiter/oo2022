public class Calculation {

    public double calculateMass(Jook jook, JoogiPudel pudel) {
        if (jook.getErikaal() != 0.0) {
            return jook.getErikaal() + pudel.getErikaal();
        }
        return pudel.getErikaal();
    }

    public double calculatePrice(Jook jook, JoogiPudel pudel) {
        if (jook.getLiitriOmahind() != 0.0) {
            return jook.getLiitriOmahind() + pudel.getTaaraMaksumus();
        }
        return pudel.getTaaraMaksumus();
    }

    public static void fillOneBottle() {
        JoogiPudel myJoogiPudel = new JoogiPudel(0.5, "Glass", 0.1, 0.2);
        Joogivaat myJoogiVaat = new Joogivaat("Coca-cola", 100);

        System.out.println("Remaining general " + myJoogiVaat.getNimetus() + " amount = " + (myJoogiVaat.getJoogiKogusLitris() - myJoogiPudel.getMaht()));
    }

    public static void fillAllDrink(int bottleAmount) {
        JoogiPudel myJoogiPudel = new JoogiPudel(0.5, "Glass", 0.1, 0.2);
        Joogivaat myJoogiVaat = new Joogivaat("Kali", 150);

        if (myJoogiVaat.getJoogiKogusLitris() < (myJoogiPudel.getMaht() * bottleAmount)) {
            System.out.println("Not enough amount of drink");
        } else {
            System.out.println(myJoogiVaat.getJoogiKogusLitris() - (myJoogiPudel.getMaht() * bottleAmount) + " liters of " + myJoogiVaat.getNimetus() + " remaining");

        }
    }

    public double calculateBoxPrice(Jook jook, JoogiPudel joogiPudel, int bottleAmount) {
        return Math.floor((jook.getLiitriOmahind() + joogiPudel.getTaaraMaksumus()) * bottleAmount);
    }

    public double calculateBoxMass(Jook jook, JoogiPudel joogiPudel, int bottleAmount) {
        return Math.floor(jook.getErikaal() + joogiPudel.getErikaal()) * bottleAmount;
    }
}
