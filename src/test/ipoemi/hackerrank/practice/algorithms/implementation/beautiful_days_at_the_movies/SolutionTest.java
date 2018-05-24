package ipoemi.hackerrank.practice.algorithms.implementation.beautiful_days_at_the_movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void beautifulDays() {
        int sol = Solution.beautifulDays(20, 23, 6);
        assertEquals(2, sol);
    }
}