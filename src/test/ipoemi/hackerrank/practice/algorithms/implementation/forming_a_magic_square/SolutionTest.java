package ipoemi.hackerrank.practice.algorithms.implementation.forming_a_magic_square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void formingMagicSquare() {
        int[][] mat = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        int sol = Solution.formingMagicSquare(mat);
        assertEquals(7, sol);

        mat = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        sol = Solution.formingMagicSquare(mat);
        assertEquals(1, sol);

        mat = new int[][]{{4, 8, 2}, {4, 5, 7}, {6, 1, 6}};
        sol = Solution.formingMagicSquare(mat);
        assertEquals(4, sol);
    }
}