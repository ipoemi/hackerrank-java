package ipoemi.hackerrank.practice.algorithms.implementation.append_and_delete;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        if (s.length() + t.length() <= k) return "Yes";
        else {
            int i = 0;
            while (i < Math.min(s.length(), t.length())) {
                if (s.charAt(i) != t.charAt(i)) break;
                i++;
            }
            int diff = s.length() - i + t.length() - i;
            if (k < diff) return "No";
            else if ((k - diff) % 2 == 0) return "Yes";
            else return "No";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

