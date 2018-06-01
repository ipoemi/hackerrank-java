package ipoemi.hackerrank.practice.algorithms.implementation.append_and_delete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void appendAndDelete() {
        String sol = Solution.appendAndDelete("hackerhappy", "hackerrank", 9);
        assertEquals("Yes", sol);

        sol = Solution.appendAndDelete("aba", "aba", 7);
        assertEquals("Yes", sol);

        sol = Solution.appendAndDelete("ashley", "ash", 2);
        assertEquals("No", sol);
    }
}