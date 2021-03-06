package ipoemi.hackerrank.practice.algorithms.implementation.grading_students;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        int[] ret = new int[grades.length];
        int q;
        int diff;
        for (int i = 0; i < grades.length; i++) {
            ret[i] = grades[i];
            if (grades[i] > 37) {
                q = grades[i] / 5;
                diff = grades[i] - (q * 5);
                if (diff > 2) ret[i] = (q * 5) + 5;
            }
        }
        return ret;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}

