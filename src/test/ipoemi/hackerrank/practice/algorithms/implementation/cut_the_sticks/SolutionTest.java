package ipoemi.hackerrank.practice.algorithms.implementation.cut_the_sticks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void cutTheSticks() {
        int[] sol = Solution.cutTheSticks(new int[]{5, 4, 4, 2, 2, 8});
        assertArrayEquals(new int[]{6, 4, 2, 1}, sol);

        sol = Solution.cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1});
        assertArrayEquals(new int[]{8, 6, 4, 1}, sol);
    }
}