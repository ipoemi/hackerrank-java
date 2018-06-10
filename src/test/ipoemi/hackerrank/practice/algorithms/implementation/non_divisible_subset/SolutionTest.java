package ipoemi.hackerrank.practice.algorithms.implementation.non_divisible_subset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void nonDivisibleSubset() {
        int sol = Solution.nonDivisibleSubset(3, new int[] {1, 7, 2, 4});
        assertEquals(3, sol);
    }
}