package ipoemi.hackerrank.practice.algorithms.implementation.divisible_sum_pairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void divisibleSumPairs() {
        int sol = Solution.divisibleSumPairs(6, 3, new int[]{1, 3, 2, 6, 1, 2});
        assertEquals(5, sol);
    }
}