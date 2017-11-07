package warmup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(in.nextLong());
        }

        Optional<Long> max = numbers.stream()
                .max(Comparator.comparingLong(Long::longValue));

        numbers.remove(max.orElse(0L));
        Optional<Long> minSum = numbers.stream().reduce(Long::sum);
        numbers.add(max.orElse(0L));

        Optional<Long> min = numbers.stream()
                .min(Comparator.comparingLong(Long::longValue));

        numbers.remove(min.orElse(0L));
        Optional<Long> maxSum = numbers.stream().reduce(Long::sum);

        System.out.println(minSum.orElse(0L) + " " + maxSum.orElse(0L));
    }
}
