package ipoemi.hackerrank.practice.algorithms.implementation.fair_rations;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    // Complete the fairRations function below.
    static String fairRations(int[] B) {
        boolean[] ba = new boolean[B.length];
        IntStream.range(0, B.length).forEach(i -> ba[i] = B[i] % 2 == 0);
        int ret = IntStream.range(0, ba.length).reduce(0, (cnt, i) -> {
            if (i == ba.length - 1) {
                if (!ba[i]) return -1;
            } else if (!ba[i]) {
                ba[i + 1] = !ba[i + 1];
                return cnt + 2;
            }
            return cnt;
        });
        if (ret == -1) return "NO";
        else return String.valueOf(ret);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        String result = fairRations(B);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

