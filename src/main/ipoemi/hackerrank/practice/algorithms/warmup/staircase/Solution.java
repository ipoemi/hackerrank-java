package ipoemi.hackerrank.practice.algorithms.warmup.staircase;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    static String repeat(String str, int rep) {
        StringBuffer sb = new StringBuffer();
        IntStream.range(0, rep).forEach(i -> sb.append(str));
        return sb.toString();
    }

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        IntStream.range(0, n).forEach(i -> System.out.println(String.format("%" + n + "s", repeat("#", i + 1))));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}

