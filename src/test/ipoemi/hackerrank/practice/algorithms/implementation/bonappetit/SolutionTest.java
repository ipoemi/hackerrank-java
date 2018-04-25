package ipoemi.hackerrank.practice.algorithms.implementation.bonappetit;

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
    static void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    void bonappetit() {
        List<String> expect = new LinkedList<>();
        expect.add("5");

        Solution.bonappetit(1, new int[]{3, 10, 2, 9}, 12);

        Scanner scanner = new Scanner(outContent.toString());
        List<String> actual = new LinkedList<>();
        actual.add(scanner.nextLine());

        assertLinesMatch(expect, actual);

        expect = new LinkedList<>();
        expect.add("Bon Appetit");

        Solution.bonappetit(1, new int[]{3, 10, 2, 9}, 7);

        scanner = new Scanner(outContent.toString());
        actual = new LinkedList<>();
        actual.add(scanner.nextLine());
    }
}