package ipoemi.hackerrank.practice.algorithms.implementation.sequence_equation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void permutationEquation() {
        int[] sol = Solution.permutationEquation(new int[]{5, 2, 1, 3, 4});
        assertArrayEquals(new int[]{4, 2, 5, 1, 3}, sol);

        sol = Solution.permutationEquation(new int[]{2, 3, 1});
        assertArrayEquals(new int[]{2, 3, 1}, sol);
    }
}