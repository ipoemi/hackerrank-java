package ipoemi.hackerrank.practice.algorithms.implementation.electronics_shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getMoneySpent() {
        int sol = Solution.getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10);
        assertEquals(9, sol);
        sol = Solution.getMoneySpent(new int[]{4}, new int[]{5}, 5);
        assertEquals(-1, sol);
    }
}