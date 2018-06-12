package ipoemi.hackerrank.practice.algorithms.implementation.equalize_the_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void equalizeArray() {
        int sol = Solution.equalizeArray(new int[]{1, 2, 2, 3});
        assertEquals(2, sol);
        sol = Solution.equalizeArray(new int[]{3, 3, 2, 1, 3});
        assertEquals(2, sol);
    }
}