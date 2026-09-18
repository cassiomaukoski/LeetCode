package com.cassiomaukoski.question66_plus_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void plusOne_incrementsLastDigit() {
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    void plusOne_handlesCarryOverflow() {
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
    }

    @Test
    void plusOne_propagatesCarryThroughMultipleDigits() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, solution.plusOne(new int[]{9, 9, 9}));
    }

    @Test
    void plusOne_carryStopsAtFirstNonNineDigit() {
        assertArrayEquals(new int[]{1, 3, 0, 0}, solution.plusOne(new int[]{1, 2, 9, 9}));
    }

    @Test
    void plusOne_singleDigitWithoutCarry() {
        assertArrayEquals(new int[]{1}, solution.plusOne(new int[]{0}));
    }
}
