package ipoemi.hackerrank.practice.algorithms.implementation.viral_advertising;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void viralAdvertising() {
        int sol = Solution.viralAdvertising(1);
        assertEquals(2, sol);

        sol = Solution.viralAdvertising(2);
        assertEquals(5, sol);

        sol = Solution.viralAdvertising(3);
        assertEquals(9, sol);

        sol = Solution.viralAdvertising(4);
        assertEquals(15, sol);

        sol = Solution.viralAdvertising(5);
        assertEquals(24, sol);
    }
}