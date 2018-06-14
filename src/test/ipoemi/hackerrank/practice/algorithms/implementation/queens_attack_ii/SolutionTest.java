package ipoemi.hackerrank.practice.algorithms.implementation.queens_attack_ii;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void queensAttack() {
        int sol = Solution.queensAttack(4, 0, 4, 4, new int[0][2]);
        assertEquals(9, sol);
        sol = Solution.queensAttack(5, 3, 4, 3, new int[][]{{5, 5}, {4, 2}, {2, 3}});
        assertEquals(10, sol);
        sol = Solution.queensAttack(1, 0, 1, 1, new int[0][2]);
        assertEquals(0, sol);
    }
}