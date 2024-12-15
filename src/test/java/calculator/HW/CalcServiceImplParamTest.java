package calculator.HW;

import calculator.HW.Service.CalculatorService;
import calculator.HW.Service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static calculator.HW.CalcServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcServiceImplParamTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    private static Stream<Arguments> provideArgumentsForTest() {
        return Stream.of(
                Arguments.of(ONE, SEVEN),
                Arguments.of(ZERO, SIX),
                Arguments.of(ONE, ONE),
                Arguments.of(FIVE, SIX)
        );
    }

    @MethodSource("provideArgumentsForTest")
    @ParameterizedTest
    void testSum(Integer num1, Integer num2) {
        assertEquals(num1 + num2, out.sum(num1, num2));
    }

    @MethodSource("provideArgumentsForTest")
    @ParameterizedTest
    void testMinus(Integer num1, Integer num2) {
        assertEquals(num1 - num2, out.minus(num1, num2));
    }


    @MethodSource("provideArgumentsForTest")
    @ParameterizedTest
    void testMultiply(Integer num1, Integer num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @MethodSource("provideArgumentsForTest")
    @ParameterizedTest
    void testDivide(Integer num1, Integer num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }
}
