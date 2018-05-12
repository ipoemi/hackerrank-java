package ipoemi.hackerrank.practice.algorithms.implementation.migratory_birds;

import java.util.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        int maxIdx = 1;
        int[] cnts = new int[]{0, 0, 0, 0, 0, 0};
        for (int a: ar) {
            cnts[a]++;
            if (cnts[a] > cnts[maxIdx]) maxIdx = a;
        }
        for (int i = 1; i < cnts.length; i++) {
            if (cnts[maxIdx] == cnts[i]) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}

