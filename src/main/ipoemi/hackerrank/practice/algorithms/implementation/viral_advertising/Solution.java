package ipoemi.hackerrank.practice.algorithms.implementation.viral_advertising;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class Solution {

    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        return Stream.iterate(2.0, i -> Math.floor(i * 3 / 2))
                .limit(n)
                .mapToInt(Double::intValue)
                .reduce(0, (n1, n2) -> n1 + n2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

