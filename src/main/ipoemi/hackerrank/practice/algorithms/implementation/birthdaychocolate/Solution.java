package ipoemi.hackerrank.practice.algorithms.implementation.birthdaychocolate;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        int cnt = 0;
        int sum;
        for (int i = 0; i < n; i++) {
            if (i <= n - m) {
                sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += s[i + j];
                }
                if (d == sum) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}

