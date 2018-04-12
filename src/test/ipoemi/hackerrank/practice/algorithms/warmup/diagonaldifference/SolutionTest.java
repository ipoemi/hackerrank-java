package ipoemi.hackerrank.practice.algorithms.warmup.diagonaldifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diagonalDifference() {
        int[][] inp = new int[][]{ new int[]{11, 2, 4}, new int[]{4, 5, 6}, new int[]{10, 8, -12}};
        int sol = Solution.diagonalDifference(inp);
        assertEquals(15, sol);
    }
}