package ipoemi.hackerrank.practice.algorithms.warmup.mini_max_sum;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
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

    @Test
    void miniMaxSum() {
        List<String> expect = new LinkedList<>();
        expect.add("10 14");

        Solution.miniMaxSum(new int[]{1, 2, 3, 4, 5});
        Scanner scanner = new Scanner(outContent.toString());
        List<String> actual = new LinkedList<>();
        actual.add(scanner.nextLine());

        assertLinesMatch(expect, actual);
    }
}