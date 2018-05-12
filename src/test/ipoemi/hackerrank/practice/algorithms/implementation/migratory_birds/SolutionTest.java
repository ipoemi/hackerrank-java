package ipoemi.hackerrank.practice.algorithms.implementation.migratory_birds;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void migratoryBirds() {
        int sol = Solution.migratoryBirds(6, new int[]{1, 4, 4, 4, 5, 3});
        assertEquals(4, sol);
    }
}