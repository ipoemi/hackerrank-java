package ipoemi.hackerrank.practice.algorithms.warmup.time_conversion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    void timeConversion() {
        String sol = Solution.timeConversion("07:05:45PM");
        assertEquals("19:05:45", sol);
        sol = Solution.timeConversion("12:05:45PM");
        assertEquals("00:05:45", sol);
        sol = Solution.timeConversion("12:05:45AM");
        assertEquals("12:05:45", sol);
        sol = Solution.timeConversion("01:05:45AM");
        assertEquals("01:05:45", sol);
        sol = Solution.timeConversion("01:05:45PM");
        assertEquals("13:05:45", sol);
    }
}