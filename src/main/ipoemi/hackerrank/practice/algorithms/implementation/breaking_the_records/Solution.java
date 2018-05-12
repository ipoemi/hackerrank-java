package ipoemi.hackerrank.practice.algorithms.implementation.breaking_the_records;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the breakingRecords function below.
     */
    static int[] breakingRecords(int[] score) {
        int max = -1;
        int maxCnt = 0;
        int min = 100000001;
        int minCnt = 0;
        for (int i: score) {
            if (max == -1) max = i;
            else if (i > max) {
                max = i;
                maxCnt++;
            }
            if (min == 100000001) min = i;
            else if (i < min) {
                min = i;
                minCnt++;
            }
        }
        return new int[]{maxCnt, minCnt};
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}

