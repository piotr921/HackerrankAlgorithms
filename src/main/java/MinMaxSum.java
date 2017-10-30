import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Long> numbers = new HashMap<>();
        List<Long> sumList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            numbers.put(i, in.nextLong());
        }

        for (int i = 0; i < 5; i++) {
            final Integer currentSkip = i;
            Optional<Long> sum = numbers.entrySet().stream()
                    .filter(entry -> !entry.getKey().equals(currentSkip))
                    .map(Map.Entry::getValue)
                    .reduce(Long::sum);

            sumList.add(sum.orElse(0L));
        }

        Optional<Long> max = sumList.stream()
                .max(Comparator.comparingLong(Long::longValue));

        Optional<Long> min = sumList.stream()
                .min(Comparator.comparingLong(Long::longValue));

        System.out.println(min.orElse(0L) + " " + max.orElse(0L));
    }
}
