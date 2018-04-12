package ipoemi.hackerrank.practice.algorithms.warmup.plusminus;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.regex.*;

public class Solution {

    static int count(int[] arr, Predicate<? super Integer> pred) {
        int cnt = 0;
        for (int t : arr) {
            if (pred.test(t)) cnt += 1;
        }
        return cnt;
    }

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        double length = arr.length * 1.0;
        int plus = count(arr, i -> i > 0);
        int minus = count(arr, i -> i < 0);
        int zero = count(arr, i -> i == 0);

        System.out.println(String.format("%.7f", plus / length));
        System.out.println(String.format("%.7f", minus / length));
        System.out.println(String.format("%.7f", zero / length));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}

