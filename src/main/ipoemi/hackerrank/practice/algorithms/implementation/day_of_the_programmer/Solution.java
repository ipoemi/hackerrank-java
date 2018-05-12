package ipoemi.hackerrank.practice.algorithms.implementation.day_of_the_programmer;

import java.util.*;

public class Solution {

    static String solve(int year){
        if (year == 1918) return "26.09.1918";
        else if (isLeap(year)) return "12.09." + year;
        else return "13.09." + year;
    }

    private static boolean isLeap(int year) {
        if (year < 1918) return year % 4 == 0;
        else return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}

