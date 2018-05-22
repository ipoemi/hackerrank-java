package ipoemi.hackerrank.practice.algorithms.implementation.picking_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pickingNumbers() {
        int sol = Solution.pickingNumbers(new int[]{4, 6, 5, 3, 3, 1});
        assertEquals(3, sol);

        sol = Solution.pickingNumbers(new int[]{1, 2, 2, 3, 1, 2});
        assertEquals(5, sol);
    }
}