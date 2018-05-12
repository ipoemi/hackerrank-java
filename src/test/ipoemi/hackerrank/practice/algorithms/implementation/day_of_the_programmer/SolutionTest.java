package ipoemi.hackerrank.practice.algorithms.implementation.day_of_the_programmer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solve() {
        String sol = Solution.solve(2017);
        assertEquals("13.09.2017", sol);
        sol = Solution.solve(2016);
        assertEquals("12.09.2016", sol);
        sol = Solution.solve(1800);
        assertEquals("12.09.1800", sol);
    }
}