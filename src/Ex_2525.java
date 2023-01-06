import java.util.Scanner;

public class Ex_2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hour = s.nextInt();
        int minute = s.nextInt();
        int duration = s.nextInt();

        if (minute + duration >= 60) {
            int total_minute = minute + duration;
            hour = hour + total_minute / 60;
            minute = total_minute % 60;

            if (hour >= 24) {
                hour = hour - 24;
            }
        } else {
            minute = minute + duration;
        }
        System.out.println(hour + " " + minute);
    }
}
