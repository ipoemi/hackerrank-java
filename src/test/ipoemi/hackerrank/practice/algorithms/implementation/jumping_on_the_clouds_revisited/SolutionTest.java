package ipoemi.hackerrank.practice.algorithms.implementation.jumping_on_the_clouds_revisited;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void jumpingOnClouds() {
        int sol = Solution.jumpingOnClouds(new int[]{0, 0, 1, 0}, 2);
        assertEquals(96, sol);
        sol = Solution.jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2);
        assertEquals(92, sol);
    }
}