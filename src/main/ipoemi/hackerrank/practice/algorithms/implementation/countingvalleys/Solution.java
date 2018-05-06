package ipoemi.hackerrank.practice.algorithms.implementation.countingvalleys;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int countingValleys(int n, String s) {
        // Complete this function
        int prev;
        int height = 0;
        int cnt = 0;
        for (char ch: s.toCharArray()) {
            prev = height;
            if (ch == 'U') height += 1;
            else height -= 1;
            if (height == 0 && prev < 0) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}

