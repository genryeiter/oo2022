import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {
    private static Calculation calculate = new Calculation();

    @Test
    void calculateMass() {
        Jook myJook = new Jook("Coca-cola", 0.55, 0.25);
        JoogiPudel myJoogiPudel = new JoogiPudel(0.5, "Classic", 0.5, 0.1);
        assertEquals(calculate.calculateMass(myJook, myJoogiPudel), 0.75);
    }

    @Test
    void calculatePrice() {
        Jook myJook = new Jook("Coca-cola", 0.55, 0.25);
        JoogiPudel myJoogiPudel = new JoogiPudel(0.5, "Classic", 0.5, 0.1);
        assertEquals(calculate.calculatePrice(myJook, myJoogiPudel), 0.65);
    }

    @Test
    void calculateBoxPrice() {
        Jook myJook = new Jook("Coca-cola", 0.55, 0.25);
        JoogiPudel myJoogiPudel = new JoogiPudel(0.5, "Classic", 0.5, 0.1);
        assertEquals(calculate.calculateBoxPrice(myJook, myJoogiPudel, 24), 15);
    }

    @Test
    void calculateBoxMass() {
        Jook myJook = new Jook("Coca-cola", 0.55, 0.25);
        JoogiPudel myJoogiPudel = new JoogiPudel(0.5, "Classic", 0.5, 0.1);
        assertEquals(calculate.calculateBoxPrice(myJook, myJoogiPudel, 24), 15);
    }

}