package calculator.HW;

import calculator.HW.Exceptions.ZeroException;
import calculator.HW.Service.CalculatorService;
import calculator.HW.Service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static calculator.HW.CalcServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void testSum() {
        assertEquals(SIX, out.sum(ONE, FIVE));
        assertEquals(ONE, out.sum(ZERO, ONE));
    }

    @Test
    void test_minus() {
        assertEquals(ONE, out.minus(SIX, FIVE));
        assertEquals(ZERO, out.minus(SEVEN, SEVEN));
    }

    @Test
    void testMultiply() {
        assertEquals(SIX, out.multiply(ONE, SIX));
        assertEquals(ZERO, out.multiply(SEVEN, ZERO));
    }

    @Test
    void testDivide() {
        assertEquals(ONE, out.divide(ONE, ONE));
        assertEquals(ONE, out.divide(FIVE, FIVE));
    }

    @Test
    public void shouldThrowZeroException() {
        assertThrows(ZeroException.class, () -> out.divide(FIVE, ZERO));
    }
}

