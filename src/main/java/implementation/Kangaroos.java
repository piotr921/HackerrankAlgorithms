package implementation;

import java.util.Scanner;

public class Kangaroos {
    private static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 - v2 == 0) {
            return "NO";
        }

        if ((x1 - x2) / (v1 - v2) < 0) {
            return "NO";
        }

        return (Math.abs(x1 - x2) % Math.abs(v1 - v2) == 0) ? "YES" : "NO";
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
