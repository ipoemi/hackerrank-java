package ipoemi.hackerrank.practice.algorithms.implementation.picking_numbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    // Complete the pickingNumbers function below.
    static int pickingNumbers(int[] a) {
        return sol2(a);
    }

    static int sol1(int[] a) {
        Arrays.sort(a);
        int maxLength = 0;
        int length = 0;
        int cur = a[0];
        int i = 0;
        int j = 0;
        while (i < a.length) {
            if (j >= a.length) {
                maxLength = Math.max(maxLength, length);
                length = 0;
                cur = a[i];
                j = i;
            } else if (a[j] == cur) {
                length++;
                i++;
                j++;
            } else if (a[j] - cur == 1) {
                length++;
                j++;
            } else {
                maxLength = Math.max(maxLength, length);
                length = 0;
                cur = a[i];
                j = i;
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }

    static int sol2(int[] a) {
        Map<Integer, Integer> map = new TreeMap<>();
        int maxLength = 0;
        for (int i: a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i: map.keySet()) {
            maxLength = Math.max(maxLength, map.getOrDefault(i, 0) + map.getOrDefault(i + 1, 0));
        }
        return maxLength;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

