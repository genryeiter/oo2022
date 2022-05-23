import java.util.List;

public class Main {

    private static final String PATH = "sisendid.txt";

    public static void main(String[] args){
        Reader fileReader = new Reader();

        CalculationSimple findSimple = new CalculationSimpleImpl();
        CalculationAdvanced findAdvanced = new CalculationAdvancedImpl();

        List<List<Double>> workingArray = fileReader.readFile(PATH);

        for (List<Double> arguments :
             workingArray) {
            Double a = arguments.get(0);
            Double b = arguments.get(1);
            Double x = null;

            if (arguments.size() == 3) x = arguments.get(2);

            if (x == null) {
                findAdvanced.findYs(a, b);
                findAdvanced.findFunctionZeroPoints(a, b);
                System.out.println("------------------");
            } else if (b == 0.0) {
                System.out.printf("The Y value is %.2f (Calculated by using simple class)\n", findSimple.findY(x, a));
            } else {
                System.out.printf("The Y value is %.2f (Calculated by using advanced class)\n", findAdvanced.findY(x, a, b));
            }
        }
    }
}
