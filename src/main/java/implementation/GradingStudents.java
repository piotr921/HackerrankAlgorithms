package implementation;

import java.util.Arrays;
import java.util.Scanner;

public class GradingStudents {

    private static int[] solve(int[] grades) {
        return Arrays.stream(grades)
                .map(GradingStudents::round)
                .toArray();
    }

    private static int round(int grade) {
        if (grade < 38) {
            return grade;
        }

        int restFromFive = grade % 5;
        if (restFromFive >= 3) {
            return grade + (5 - restFromFive);
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
