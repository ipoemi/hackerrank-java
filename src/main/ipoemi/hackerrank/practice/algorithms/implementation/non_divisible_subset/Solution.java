package ipoemi.hackerrank.practice.algorithms.implementation.non_divisible_subset;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, int[] S) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(S).map(i -> i % k).forEach(mod -> map.put(mod, map.getOrDefault(mod, 0) + 1));
        map.put(0, Math.min(map.getOrDefault(0, 0), 1));
        if (k % 2 == 0) map.put(k / 2, Math.min(map.getOrDefault(k / 2, 0), 1));
        return IntStream.range(0, k / 2 + 1)
                .map(i -> Math.max(map.getOrDefault(i, 0), map.getOrDefault(k - i, 0))).sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] S = new int[n];

        String[] SItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int SItem = Integer.parseInt(SItems[i]);
            S[i] = SItem;
        }

        int result = nonDivisibleSubset(k, S);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

