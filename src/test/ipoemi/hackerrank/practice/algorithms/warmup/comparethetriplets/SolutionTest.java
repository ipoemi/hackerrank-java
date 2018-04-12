package ipoemi.hackerrank.practice.algorithms.warmup.comparethetriplets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solve() {
        int[] sol = Solution.solve(5, 6, 7, 3, 6, 10);
        assertArrayEquals(new int[]{1, 1}, sol);
    }
}