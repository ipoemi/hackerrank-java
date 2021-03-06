package ipoemi.hackerrank.practice.algorithms.warmup.diagonal_difference;

import java.io.*;
import java.util.*;

public class Solution {

    static int diagonal(int[] start, int[] dxdy, int[][] mat) {
        int ret = 0;
        for (int[] aMat : mat) {
            ret += mat[start[0]][start[1]];
            start[0] += dxdy[0];
            start[1] += dxdy[1];
        }
        return ret;
    }

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        int d1 = diagonal(new int[]{0, 0}, new int[]{1, 1}, a);
        int d2 = diagonal(new int[]{0, a.length - 1}, new int[]{1, -1}, a);
        return Math.abs(d1 - d2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}

