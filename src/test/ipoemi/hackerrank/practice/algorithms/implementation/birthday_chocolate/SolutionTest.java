package ipoemi.hackerrank.practice.algorithms.implementation.birthday_chocolate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solve() {
        int sol = Solution.solve(5, new int[]{1, 2, 1, 3, 2}, 3, 2);
        assertEquals(2, sol);
        sol = Solution.solve(6, new int[]{1, 1, 1, 1, 1, 1}, 3, 2);
        assertEquals(0, sol);
        sol = Solution.solve(1, new int[]{4}, 4, 1);
        assertEquals(1, sol);
    }
}