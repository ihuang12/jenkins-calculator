import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertAll(() -> assertEquals(3, Calculator.add(1,2)),
                () -> assertEquals(300, Calculator.add(100, 200)),
                () -> assertEquals(3, Calculator.add(3, 0)));
    }

    @Test
    void subtract() {
        assertAll(() -> assertEquals(1, Calculator.subtract(2, 1)),
                () -> assertEquals(0, Calculator.subtract(200, 200)),
                () -> assertEquals(3, Calculator.subtract(3, 0)));
    }

    @Test
    void multiply() {
        assertAll(() -> assertEquals(2, Calculator.multiply(1,2)),
                () -> assertEquals(200, Calculator.multiply(10, 20)),
                () -> assertEquals(0, Calculator.multiply(3, 0)));
    }

    @Test
    void divide() {
        assertAll(() -> assertEquals(2, Calculator.divide(2,1)),
                () -> assertEquals(1, Calculator.divide(200, 200)),
                () -> assertEquals(0, Calculator.divide(0, 3)));
    }

    @Test
    void exponent() {
        assertAll(() -> assertEquals(8, Calculator.exponent(2,3)),
                () -> assertEquals(10000, Calculator.exponent(100, 2)),
                () -> assertEquals(1, Calculator.exponent(3, 0)));
    }
}
