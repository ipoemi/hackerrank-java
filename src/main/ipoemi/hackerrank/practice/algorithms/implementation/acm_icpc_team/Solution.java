package ipoemi.hackerrank.practice.algorithms.implementation.acm_icpc_team;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        BitSet[] bsa = new BitSet[topic.length];
        for (int i = 0; i < topic.length; i++) {
            bsa[i] = new BitSet();
            char[] ca = topic[i].toCharArray();
            for (int j = 0; j < ca.length; j++) {
                if (ca[j] == '1') bsa[i].set(j);
            }
        }
        final ArrayList<BitSet> maxs = new ArrayList<>();
        int maxCnt = 0;
        for (int i = 0; i < topic.length - 1; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                BitSet cur = new BitSet();
                cur.or(bsa[i]);
                cur.or(bsa[j]);
                int cnt = cur.cardinality();
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                    maxs.clear();
                    maxs.add(cur);
                } else if (cnt == maxCnt) {
                    maxs.add(cur);
                }
            }
        }
        return new int[]{maxCnt, maxs.size()};
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

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

