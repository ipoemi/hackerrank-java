package ipoemi.hackerrank.practice.algorithms.implementation.angry_professor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void angryProfessor() {
        String sol = Solution.angryProfessor(3, new int[]{-1, -3, 4, 2});
        assertEquals("YES", sol);

        sol = Solution.angryProfessor(2, new int[]{0, -1, 2, 1});
        assertEquals("NO", sol);
    }
}