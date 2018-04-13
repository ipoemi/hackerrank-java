package ipoemi.hackerrank.practice.algorithms.implementation.kangaroo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.function.BiFunction;
import java.util.regex.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        int fastDistance;
        int slowDistance;
        int fastVelocity;
        int slowVelocity;
        if (v1 > v2) {
            fastDistance = x1;
            fastVelocity = v1;
            slowDistance = x2;
            slowVelocity = v2;
        } else {
            fastDistance = x2;
            fastVelocity = v2;
            slowDistance = x1;
            slowVelocity = v1;
        }

        while (true) {
            if (fastDistance > slowDistance) {
                return "NO";
            }
            if (fastDistance == slowDistance) return "YES";
            fastDistance += fastVelocity;
            slowDistance += slowVelocity;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}

