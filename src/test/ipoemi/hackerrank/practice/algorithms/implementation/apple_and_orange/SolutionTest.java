package ipoemi.hackerrank.practice.algorithms.implementation.apple_and_orange;

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
    void countApplesAndOranges() {
        List<String> expect = new LinkedList<>();
        expect.add("1");
        expect.add("1");

        Solution.countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
        Scanner scanner = new Scanner(outContent.toString());
        List<String> actual = new LinkedList<>();
        actual.add(scanner.nextLine());
        actual.add(scanner.nextLine());

        assertLinesMatch(expect, actual);
    }
}