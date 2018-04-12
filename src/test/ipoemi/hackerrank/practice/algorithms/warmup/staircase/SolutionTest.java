package ipoemi.hackerrank.practice.algorithms.warmup.staircase;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

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
    void staircase() {
        List<String> expect = new LinkedList();
        expect.add("     #");
        expect.add("    ##");
        expect.add("   ###");
        expect.add("  ####");
        expect.add(" #####");
        expect.add("######");

        Solution.staircase(6);
        Scanner scanner = new Scanner(outContent.toString());
        List<String> actual = new LinkedList();
        IntStream.range(0, 6).forEach(i -> actual.add(scanner.nextLine()));

        assertLinesMatch(expect, actual);
    }
}