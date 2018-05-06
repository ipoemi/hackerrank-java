package ipoemi.hackerrank.practice.algorithms.implementation.countingvalleys;

import ipoemi.hackerrank.practice.algorithms.implementation.countingvalleys.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solve() {
        int sol = Solution.countingValleys(8, "UDDDUDUU");
        assertEquals(1, sol);
        sol = Solution.countingValleys(12, "DDUUDDUDUUUD");
        assertEquals(2, sol);
    }
}