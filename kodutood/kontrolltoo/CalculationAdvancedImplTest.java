import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationAdvancedImplTest {
    CalculationAdvanced findAdvanced = new CalculationAdvancedImpl();

    @Test
    void findY() {
        assertEquals(2.0, findAdvanced.findY(0.0, 3.0, 2.0));
    }

    @Test
    void findYs() {
    }

    @Test
    void findFunctionZeroPoints() {
    }
}