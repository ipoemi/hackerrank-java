package ipoemi.hackerrank.practice.algorithms.implementation.jumping_on_the_clouds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void jumpingOnClouds() {
        int sol = Solution.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0});
        assertEquals(4, sol);
        sol = Solution.jumpingOnClouds(new int[]{0, 0, 0, 0, 1, 0});
        assertEquals(3, sol);
    }
}