package unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void tenDivideTwo() {
        SimpleCalculator test = new SimpleCalculator();
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            test.divide(10, 0);
        });
        assertEquals("Cannot divide to zero", exception.getMessage());
    }
}