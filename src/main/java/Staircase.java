import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col >= n - row - 1) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
