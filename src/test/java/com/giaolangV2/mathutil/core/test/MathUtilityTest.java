package com.giaolangV2.mathutil.core.test;

import com.giaolangV2.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    void testFactorialGivenRightArgument0ReturnsWell() {
        // Test case 1: Check getFactorial() with n = 0
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(0);
        // so sanh expectedValue & actualValue
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void testFactorialGivenRightArgument5ReturnsWell() {
        assertEquals(120, MathUtility.getFactorial(5));
    }

    @Test
    void testFactorialGivenRightArgumentsReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }
    @Test
    void testFactorialGivenWrongArgumentsThrowsException() {
            assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-1));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-2));
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-1));
    }
}