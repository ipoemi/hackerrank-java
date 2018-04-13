package ipoemi.hackerrank.practice.algorithms.implementation.betweentwosets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void getTotalX() {
        int sol = Solution.getTotalX(new int[]{2, 4}, new int[]{16, 32, 96});
        assertEquals(3, sol);
    }
}