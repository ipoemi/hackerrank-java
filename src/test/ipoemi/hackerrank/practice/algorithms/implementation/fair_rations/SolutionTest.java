package ipoemi.hackerrank.practice.algorithms.implementation.fair_rations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fairRations() {
        String sol = Solution.fairRations(new int[]{2, 3, 4, 5, 6});
        assertEquals("4", sol);
        sol = Solution.fairRations(new int[]{1, 2});
        assertEquals("NO", sol);
    }
}