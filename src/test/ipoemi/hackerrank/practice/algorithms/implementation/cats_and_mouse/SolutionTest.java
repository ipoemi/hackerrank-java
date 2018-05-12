package ipoemi.hackerrank.practice.algorithms.implementation.cats_and_mouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void catAndMouse() {
        String sol = Solution.catAndMouse(1, 2, 3);
        assertEquals("Cat B", sol);
        sol = Solution.catAndMouse(1, 3, 2);
        assertEquals("Mouse C", sol);
    }
}