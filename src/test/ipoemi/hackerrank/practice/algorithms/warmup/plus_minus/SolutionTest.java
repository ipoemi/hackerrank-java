package ipoemi.hackerrank.practice.algorithms.warmup.plus_minus;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    boolean absoluteEquals(Double d1, Double d2) {
        return Math.abs(d1 - d2) < 1E-4;
    }

    @Test
    void plusMinus() {
        Solution.plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
        Scanner scanner = new Scanner(outContent.toString());
        double plus = scanner.nextDouble();
        double minus = scanner.nextDouble();
        double zero = scanner.nextDouble();

        assertTrue(absoluteEquals(0.500000, plus));
        assertTrue(absoluteEquals(0.333333, minus));
        assertTrue(absoluteEquals(0.166667, zero));
    }

}