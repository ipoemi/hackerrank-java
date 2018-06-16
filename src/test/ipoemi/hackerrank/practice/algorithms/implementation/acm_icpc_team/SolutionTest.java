package ipoemi.hackerrank.practice.algorithms.implementation.acm_icpc_team;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void acmTeam() {
        int[] sol = Solution.acmTeam(new String[]{
                "10101",
                "11110",
                "00010"
        });
        assertArrayEquals(new int[]{5, 1}, sol);
        sol = Solution.acmTeam(new String[]{
                "10101",
                "11100",
                "11010",
                "00101"
        });
        assertArrayEquals(new int[]{5, 2}, sol);
    }
}