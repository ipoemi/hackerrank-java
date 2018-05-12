package ipoemi.hackerrank.practice.algorithms.implementation.counting_valleys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void countingValleys() {
        int sol = Solution.countingValleys(8, "UDDDUDUU");
        assertEquals(1, sol);
        sol = Solution.countingValleys(12, "DDUUDDUDUUUD");
        assertEquals(2, sol);
    }
}