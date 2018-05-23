package ipoemi.hackerrank.practice.algorithms.implementation.utopian_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void utopianTree() {
        int sol = Solution.utopianTree(0);
        assertEquals(1, sol);

        sol = Solution.utopianTree(1);
        assertEquals(2, sol);

        sol = Solution.utopianTree(4);
        assertEquals(7, sol);

        sol = Solution.utopianTree(3);
        assertEquals(6, sol);
    }
}