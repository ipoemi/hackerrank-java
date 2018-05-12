package ipoemi.hackerrank.practice.algorithms.implementation.sock_merchant;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sockMerchant() {
        int sol = Solution.sockMerchant(9, new int[]{ 10, 20, 20, 10, 10, 30, 50, 10, 20 });
        assertEquals(3, sol);
    }
}