import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Candles {

    private static int birthdayCakeCandles(int n, int[] ar) {
        Map<Integer, Long> candlesByHeight = Arrays.stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(
                        Integer::intValue,
                        Collectors.counting())
                );
        Integer maxHeight = candlesByHeight.keySet().stream()
                .max(Integer::compareTo)
                .orElse(0);

        String noOfCandles = String.valueOf(candlesByHeight.get(maxHeight));
        return Integer.valueOf(noOfCandles);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
