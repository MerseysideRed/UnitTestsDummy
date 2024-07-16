import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testCalculatorAdd() {
        Calculator calculator = new Calculator();
        assertEquals("Test is passed", 5, calculator.add(3, 2));
    }

    @Test
    public void testCalculatorSubtract() {
        Calculator calculator = new Calculator();
        assertEquals("Test is passed", 1, calculator.subtract(3, 2));
    }

    @Test
    public void testCalculatorMultiply() {
        Calculator calculator = new Calculator();
        assertEquals("Test is passed", 6, calculator.multiply(3, 2));
    }

    @Test
    public void testCalculatorDivide() {
        Calculator calculator = new Calculator();
        assertEquals("Test is passed", 3, calculator.divide(3, 1));
    }
}
