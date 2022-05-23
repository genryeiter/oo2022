import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationSimpleImplTest {
    CalculationSimple findSimple = new CalculationSimpleImpl();

    @Test
    void findY() {
        assertEquals(6.0, findSimple.findY(2.0, 3.0));
    }
}