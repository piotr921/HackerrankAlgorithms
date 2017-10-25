import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class PlusMinus {

    enum Type {
        PLUS, MINUS, ZERO;

        static Type select(int number) {
            return number > 0 ? PLUS : number == 0 ? ZERO : MINUS;
        }
    }

    static class Number {
        private int value;
        private Type type;

        Number(int value) {
            this.value = value;
            this.type = Type.select(value);
        }

        Type getType() {
            return type;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Number> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(new Number(in.nextInt()));
        }

        Map<Type, Long> result = numbers.stream()
                .collect(groupingBy(Number::getType, counting()));

        double positiveFraction = (double) result.getOrDefault(Type.PLUS, 0L) / (double) numbers.size();
        double negativeFraction = (double) result.getOrDefault(Type.MINUS, 0L) / (double) numbers.size();
        double zeroFraction = (double) result.getOrDefault(Type.ZERO, 0L) / (double) numbers.size();

        System.out.println(new BigDecimal(positiveFraction, new MathContext(6)));
        System.out.println(new BigDecimal(negativeFraction, new MathContext(6)));
        System.out.println(new BigDecimal(zeroFraction, new MathContext(6)));
    }
}

