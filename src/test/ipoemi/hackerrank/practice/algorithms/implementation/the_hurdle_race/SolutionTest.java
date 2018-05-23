package ipoemi.hackerrank.practice.algorithms.implementation.the_hurdle_race;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hurdleRace() {
        int sol = Solution.hurdleRace(4, new int[]{1, 6, 3, 5, 2});
        assertEquals(2, sol);

        sol = Solution.hurdleRace(7, new int[]{2, 5, 4, 5, 2});
        assertEquals(0, sol);
    }
}