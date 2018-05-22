package ipoemi.hackerrank.practice.algorithms.implementation.climbing_the_leaderboard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        return sol2(scores, alice);
    }

    static int[] sol1(int[] scores, int[] alice) {
        int[] distinct = IntStream.of(scores).distinct().toArray();
        int[] result = new int[alice.length];
        for (int i = 0; i < alice.length; i++) {
            int j = 0;
            while (j < distinct.length && distinct[j] > alice[i]) j++;
            result[i] = j + 1;
        }
        return result;
    }

    static int[] sol2(int[] scores, int[] alice) {
        int[] array = IntStream.of(scores).distinct().toArray();
        int[] result = new int[alice.length];
        int i = array.length - 1;
        for (int j = 0; j < alice.length; j++) {
            while (i >= 0) {
                if (alice[j] >= array[i]) i--;
                else {
                    result[j] = i + 2;
                    break;
                }
            }
            if (i < 0) result[j] = 1;
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

