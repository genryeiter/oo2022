import java.util.Scanner;

public class Calculator {


    public static double summ(Double a, Double b) {
        return a + b;
    }

    public static double minus(Double a, Double b) {
        return a - b;
    }

    public static double korrutamine(Double a, Double b) {
        return a * b;
    }

    public static double jagamine(Double a, Double b) {
        return a / b;
    }

    public static void main(String[] args) {

        double a,b,result;
        Scanner s = new Scanner(System.in);
        System.out.print("Sisestage esimese numbrit:");
        a = s.nextDouble();
        System.out.print("Sisestage teise numbrit:");
        b = s.nextDouble();

        System.out.print("Valige operaatorit (+, -, *, /): ");
        char operaator = s.next().charAt(0);



        switch (operaator)
        {
            case '+' -> result = summ(a, b);

            case '-' -> result = minus(a, b);

            case '*' -> result = korrutamine(a, b);

            case '/' -> result = jagamine(a, b);

            default -> {
                System.out.printf("Olete sisestanud/valinud vale numbrit/operaatorit");
                return;
            }
        }

        System.out.println(a+" "+operaator+" "+b+" = "+result);
    }


}