package ipoemi.hackerrank.practice.algorithms.implementation.bon_appetit;

import java.util.*;

public class Solution {

    static void bonappetit(int k, int[] bill, int b) {
        int sum = 0;
        for (int i = 0; i < bill.length; i++) {
            if (i != k) sum += bill[i];
        }
        int halfSum = sum / 2;
        if (b - halfSum == 0) System.out.println("Bon Appetit"); else System.out.println(b - halfSum);
    }


    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        String[] fl = in.nextLine().split(" ");
        int k = Integer.valueOf(fl[1]);
        int[] bill = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();
        int b = Integer.valueOf(in.nextLine());
        bonappetit(k, bill, b);
    }
}

