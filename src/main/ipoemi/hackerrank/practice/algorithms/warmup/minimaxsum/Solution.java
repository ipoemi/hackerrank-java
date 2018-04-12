package ipoemi.hackerrank.practice.algorithms.warmup.minimaxsum;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    static long exclusiveSum(int[] arr, int exclusiveIndex) {
        return IntStream.range(0, arr.length).filter(i -> i != exclusiveIndex).mapToLong(i -> arr[i]).sum();
    }
    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        long[] sums = IntStream.range(0, arr.length).mapToLong(i -> exclusiveSum(arr, i)).sorted().toArray();
        long max = 0;
        long min = 0;
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > max) max = sums[i];
            if (sums[i] < min || min == 0) min = sums[i];
        }
        System.out.println(String.format("%d %d", min, max));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}

