import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        String[] time = s.split(":");
        Integer hour = Integer.valueOf(time[0]);

        if (s.contains("PM") && hour < 12) {
            hour += 12;
            time[0] = hour.toString();
        }

        if (s.contains("AM") && hour >= 12) {
            hour -= 12;
            time[0] = "0" + hour.toString();
        }

        return time[0] + ":" + time[1] + ":" + time[2].split("[A-Z]")[0];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
