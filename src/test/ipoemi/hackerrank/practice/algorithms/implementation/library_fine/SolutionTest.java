package ipoemi.hackerrank.practice.algorithms.implementation.library_fine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void libraryFine() {
        int sol = Solution.libraryFine(9, 6, 2015, 6, 6, 2015);
        assertEquals(45, sol);
    }
}