package ipoemi.hackerrank.practice.algorithms.warmup.verybigsum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void aVeryBigSum() {
        long sol = Solution.aVeryBigSum(5, new long[]{1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005});
        assertEquals(5000000015L, sol);
    }
}