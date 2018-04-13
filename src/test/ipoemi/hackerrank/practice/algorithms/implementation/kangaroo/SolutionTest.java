package ipoemi.hackerrank.practice.algorithms.implementation.kangaroo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void kangaroo() {
        String sol = Solution.kangaroo(0, 3, 4, 2);
        assertEquals("YES", sol);

        sol = Solution.kangaroo(0, 2, 5, 3);
        assertEquals("NO", sol);
    }
}