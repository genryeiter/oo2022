import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;

public class CalculationAdvancedImpl implements CalculationAdvanced {
    @Override
    public double findY(double x, double a, double b) {
        return a * x + b;
    }

    @Override
    public void findYs(double a, double b) {

        List<Double> xes = DoubleStream.generate(ThreadLocalRandom.current()::nextDouble)
                .limit(5)
                .boxed()
                .map(x -> x * 100)
                .toList();

        for (Double x :
                xes) {
            System.out.printf("Line function y with a - %.2f, b - %.2f is %.2f (x is %.2f)\n", a, b, findY(x, a, b), x);
        }
    }

    @Override
    public void findFunctionZeroPoints(double a, double b) {
        System.out.println("Function zero point is x = " + (-b)/a);
    }
}
