package ipoemi.hackerrank.practice.algorithms.implementation.organizing_containers_of_balls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void organizingContainers() {
        String sol = Solution.organizingContainers(new int[][]{{1, 1}, {1, 1}});
        assertEquals("Possible", sol);

        sol = Solution.organizingContainers(new int[][]{{0, 2}, {1, 1}});
        assertEquals("Impossible", sol);
    }
}