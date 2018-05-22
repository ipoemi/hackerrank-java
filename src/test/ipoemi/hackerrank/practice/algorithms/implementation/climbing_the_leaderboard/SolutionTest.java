package ipoemi.hackerrank.practice.algorithms.implementation.climbing_the_leaderboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void climbingLeaderboard() {
        int[] sol = Solution.climbingLeaderboard(new int[]{100, 100, 50, 40, 40, 20, 10}, new int[]{5, 25, 50, 120});
        assertArrayEquals(new int[]{6, 4, 2, 1}, sol);
    }
}