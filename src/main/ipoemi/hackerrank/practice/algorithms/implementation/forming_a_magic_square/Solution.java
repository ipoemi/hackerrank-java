package ipoemi.hackerrank.practice.algorithms.implementation.forming_a_magic_square;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    static int[][][] mss = new int[8][3][3];

    static {
        mss[0] = new int[][]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        mss[1] = new int[][]{{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        mss[2] = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        mss[3] = new int[][]{{2, 9, 4}, {7, 5, 3}, {6, 1, 8}};
        mss[4] = new int[][]{{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        mss[5] = new int[][]{{4, 3, 8}, {9, 5, 1}, {2, 7, 6}};
        mss[6] = new int[][]{{6, 7, 2}, {1, 5, 9}, {8, 3, 4}};
        mss[7] = new int[][]{{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
    }

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        return Arrays.stream(mss).mapToInt(ms -> getSquareDiff(ms, s)).min().getAsInt();
    }

    static int getSquareDiff(int[][] a, int[][] b) {
        return IntStream.range(0, a.length).map(i -> {
            return IntStream.range(0, a[i].length).map(j -> {
                return Math.abs(a[i][j] - b[i][j]);
            }).reduce((n1, n2) -> n1 + n2).getAsInt();
        }).reduce((n1, n2) -> n1 + n2).getAsInt();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

