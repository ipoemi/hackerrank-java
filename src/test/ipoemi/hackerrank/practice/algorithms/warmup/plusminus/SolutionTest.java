package ipoemi.hackerrank.practice.algorithms.warmup.plusminus;

import org.junit.jupiter.api.*;

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
    void plusMinus() {
        List<String> expect = new LinkedList();
        expect.add("0.500000".substring(0, 6));
        expect.add("0.333333".substring(0, 6));
        expect.add("0.166667".substring(0, 6));

        Solution.plusMinus(new int[]{-4, 3, -9, 0, 4, 1});
        Scanner scanner = new Scanner(outContent.toString());
        List<String> actual = new LinkedList();
        actual.add(scanner.nextLine().substring(0, 6));
        actual.add(scanner.nextLine().substring(0, 6));
        actual.add(scanner.nextLine().substring(0, 6));

        assertLinesMatch(expect, actual);
    }

}