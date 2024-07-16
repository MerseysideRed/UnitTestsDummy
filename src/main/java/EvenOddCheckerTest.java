import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddCheckerTest {

    @Test
    public void testEvenOddCheckerEven() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals("Test is passed", true, evenOddChecker.check(4));
    }

    @Test
    public void testEvenOddCheckerOdd() {
        EvenOddChecker evenOddChecker = new EvenOddChecker();
        assertEquals("Test is passed", false, evenOddChecker.check(5));
    }
}
