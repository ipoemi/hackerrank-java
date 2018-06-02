package ipoemi.hackerrank.practice.algorithms.implementation.sherlock_and_squares;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void squares() {
        int sol = Solution.squares(3, 9);
        assertEquals(2, sol);

        sol = Solution.squares(17, 24);
        assertEquals(0, sol);
    }
}