public class Main {

  private static Calculation calculate = new Calculation();

    public static void main(String[] args) {
        Jook myJook = new Jook("Coca-cola", 0.55, 0.25);
        JoogiPudel myJoogiPudel = new JoogiPudel(0.5, "Classic", 0.5, 0.1);
        System.out.println(calculate.calculateMass(myJook, myJoogiPudel) + " mass");
        System.out.println(calculate.calculatePrice(myJook, myJoogiPudel)+ " hind");

        Calculation.fillOneBottle();
        Calculation.fillAllDrink(24);

        System.out.println(Math.round(calculate.calculateBoxPrice(myJook, myJoogiPudel, 24))+ " hind");
        System.out.println(Math.round(calculate.calculateBoxMass(myJook, myJoogiPudel, 24))+ " hind");

    }
}
