package ipoemi.hackerrank.practice.algorithms.implementation.breakingtherecords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void breakingRecords() {
        int[] sol = Solution.breakingRecords(new int[]{10, 5, 20, 20, 4, 5, 2, 25, 1});
        assertArrayEquals(new int[]{2, 4}, sol);
        sol = Solution.breakingRecords(new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42});
        assertArrayEquals(new int[]{4, 0}, sol);
    }
}