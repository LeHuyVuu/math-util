package com.giaolangV2.mathutil.core.test;

import com.giaolangV2.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    // Wrong dataset: n < 0 to check for IllegalArgumentException
    public static Integer[] initWrongDataSet() {
        return new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8, -9};
    }

    // Test case 1: Check if getFactorial() throws IllegalArgumentException
    // in case of n < 0 or n > 20
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongDataSetThrowException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }

    // Right dataset: valid n and corresponding expected factorial values
    public static Object[] initRightDataSet() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
    }

    // Test case 2: check getFactorial() with right arguments, runs well
    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightDataSetRunWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
