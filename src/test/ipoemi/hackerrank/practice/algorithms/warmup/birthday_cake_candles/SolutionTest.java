package ipoemi.hackerrank.practice.algorithms.warmup.birthday_cake_candles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void birthdayCakeCandles() {
        int sol = Solution.birthdayCakeCandles(5, new int[]{3, 2, 1, 3});
        assertEquals(2, sol);
    }
}