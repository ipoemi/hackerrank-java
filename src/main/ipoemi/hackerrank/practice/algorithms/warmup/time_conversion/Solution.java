package ipoemi.hackerrank.practice.algorithms.warmup.time_conversion;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String[] ss = s.split(":");
        int hours = Integer.valueOf(ss[0]);
        int minutes = Integer.valueOf(ss[1]);
        int seconds = Integer.valueOf(ss[2].substring(0, 2));
        String ampm = ss[2].substring(2, 4);
        if (ampm.startsWith("PM") && hours != 12) hours = (hours + 12);
        if (ampm.startsWith("AM") && hours == 12) hours = 0;
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}

