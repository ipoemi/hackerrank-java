package ipoemi.hackerrank.practice.algorithms.implementation.save_the_prisoner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void saveThePrisoner() {
        int sol = Solution.saveThePrisoner(5, 2, 1);
        assertEquals(2, sol);

        sol = Solution.saveThePrisoner(5, 2, 2);
        assertEquals(3, sol);
    }
}