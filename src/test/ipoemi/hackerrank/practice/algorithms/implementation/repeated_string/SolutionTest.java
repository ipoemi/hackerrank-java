package ipoemi.hackerrank.practice.algorithms.implementation.repeated_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void repeatedString() {
        long sol = Solution.repeatedString("aba", 10);
        assertEquals(7, sol);

        sol = Solution.repeatedString("a", 1000000000000L);
        assertEquals(1000000000000L, sol);
    }
}