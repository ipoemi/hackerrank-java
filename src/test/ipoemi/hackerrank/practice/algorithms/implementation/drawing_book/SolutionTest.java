package ipoemi.hackerrank.practice.algorithms.implementation.drawing_book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pageCount() {
        int sol = Solution.pageCount(6, 2);
        assertEquals(1, sol);

        sol = Solution.pageCount(5, 4);
        assertEquals(0, sol);
    }
}