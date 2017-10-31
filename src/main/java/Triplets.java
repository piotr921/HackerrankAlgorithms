import java.util.Scanner;

public class Triplets {

    static void givePoints(int[] currentPoints, int result1, int result2) {
        if (result1 > result2) {
            currentPoints[0]++;
        }

        if (result2 > result1) {
            currentPoints[1]++;
        }
    }

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        int[] points = {0, 0};
        givePoints(points, a0, b0);
        givePoints(points, a1, b1);
        givePoints(points, a2, b2);

        return points;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
