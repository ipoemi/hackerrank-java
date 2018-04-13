package ipoemi.hackerrank.practice.algorithms.implementation.betweentwosets;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        int g1 = Arrays.stream(a).reduce(Solution::gcm).getAsInt();
        int g2 = Arrays.stream(b).reduce(Solution::gcd).getAsInt();
        int ret = 0;
        int g = g1;
        while (g <= g2) {
            if (g2 % g == 0) ret++;
            g += g1;
        }
        return ret;
    }

    static int gcd(int m, int n) {
        int r;
        while (true) {
            r = m % n;
            if (r == 0) return n;
            else {
                m = n;
                n = r;
            }
        }
    }

    static int gcm(int m, int n) {
        return m * n / gcd(m, n);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}

