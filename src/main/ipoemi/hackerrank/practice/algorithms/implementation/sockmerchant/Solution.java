package ipoemi.hackerrank.practice.algorithms.implementation.sockmerchant;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int c: ar) {
            if (map.getOrDefault(c, 0) == 1) {
                cnt++;
                map.remove(c);
            } else {
                map.put(c, 1);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}

