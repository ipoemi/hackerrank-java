package ipoemi.hackerrank.practice.algorithms.implementation.queens_attack_ii;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    private static int[][] directions = {
            {-1, 1}, {0, 1}, {1, 1},
            {-1, 0}, {1, 0},
            {-1, -1}, {0, -1}, {1, -1}
    };

    private static boolean movable(int row, int col, int max, Map<Integer, Map<Integer, Boolean>> board) {
        if (row < 1 || col < 1) return false;
        else if (row > max || col > max) return false;
        else if (!board.containsKey(row)) return true;
        else return board.get(row).getOrDefault(col, true);
    }

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        Map<Integer, Map<Integer, Boolean>> board = new HashMap<>();

        for (int[] obstacle : obstacles) {
            if (!board.containsKey(obstacle[0])) board.put(obstacle[0], new HashMap<>());
            board.get(obstacle[0]).put(obstacle[1], false);
        }

        int sum = 0;

        for (int[] dir : directions) {
            int[] pos = new int[]{r_q, c_q};
            pos[0] += dir[0];
            pos[1] += dir[1];
            while (movable(pos[0], pos[1], n, board)) {
                sum++;
                pos[0] += dir[0];
                pos[1] += dir[1];
            }
        }

        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

