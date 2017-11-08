package implementation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoSets {

    static boolean conditionA(int number, int[] array) {
        long elementsNotSatisfyingCondition = Arrays.stream(array)
                .filter(element -> number % element != 0)
                .count();
        return elementsNotSatisfyingCondition == 0;
    }

    static boolean conditionB(int number, int[] array) {
        long elementsNotSatisfyingCondition = Arrays.stream(array)
                .filter(element -> element % number != 0)
                .count();
        return elementsNotSatisfyingCondition == 0;
    }

    static int getTotalX(int[] a, int[] b) {
        return (int) IntStream.rangeClosed(a[0], b[0])
                .filter(number -> conditionA(number, a))
                .filter(number -> conditionB(number, b))
                .count();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
