package ipoemi.hackerrank.practice.algorithms.implementation.circular_array_rotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void circularArrayRotation() {
        int[] sol = Solution.circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{1, 2});
        assertArrayEquals(new int[]{5, 3}, sol);

        sol = Solution.circularArrayRotation(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2});
        assertArrayEquals(new int[]{2, 3, 1}, sol);
    }
}