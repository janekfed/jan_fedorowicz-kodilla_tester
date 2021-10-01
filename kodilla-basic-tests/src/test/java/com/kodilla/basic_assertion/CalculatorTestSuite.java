package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEqualsWithDelta;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    int a = 5;
    int b = 8;

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        int subResult = calculator.sub(a, b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSquare1() {
        double c = 1.9;
        double squareResult1 = calculator.square(c);
        assertEqualsWithDelta(3.9, squareResult1, 0.1);
    }

    @Test
    public void testSquare2() {
        double d = -3.2;
        double squareResult2 = calculator.square(d);
        assertEqualsWithDelta(10.24, squareResult2, 0.1);
    }

    @Test
    public void testSquare3() {
        double e = 0;
        double squareResult3 = calculator.square(e);
        assertEquals(0, squareResult3);
    }
}
