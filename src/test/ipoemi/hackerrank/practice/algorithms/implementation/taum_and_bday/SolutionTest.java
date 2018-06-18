package ipoemi.hackerrank.practice.algorithms.implementation.taum_and_bday;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void taumBday() {
        long sol = Solution.taumBday(10, 10, 1, 1, 1);
        assertEquals(20, sol);

        sol = Solution.taumBday(5, 9, 2, 3, 4);
        assertEquals(37, sol);

        sol = Solution.taumBday(3, 6, 9, 1, 1);
        assertEquals(12, sol);

        sol = Solution.taumBday(7, 7, 4, 2, 1);
        assertEquals(35, sol);

        sol = Solution.taumBday(3, 3, 1, 9, 2);
        assertEquals(12, sol);
    }
}