package com.kodilla.basic_assertion;

public class ResultChecker {
    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }

    public static boolean assertEqualsWithDelta(double expectedWithDelta, double actualWithDelta, double delta) {
        return expectedWithDelta == actualWithDelta && expectedWithDelta >= delta;
    }
}
