package ipoemi.hackerrank.practice.algorithms.implementation.gradingstudents;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void gradingStudents() {
        int[] sol = Solution.gradingStudents(new int[]{73, 67, 38, 33});
        assertArrayEquals(new int[]{75, 67, 40, 33}, sol);
    }
}