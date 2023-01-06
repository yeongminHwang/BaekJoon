import java.io.IOException;
import java.util.Scanner;

public class Ex_2884 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();

        int alarm = 45;
        if (minute - alarm < 0) {
            hour--;
            minute = 60 - (alarm - minute);
            if (hour < 0) {
                hour = 23;
            }
        } else{
            minute = minute - alarm;
        }

        System.out.println(hour + " " + minute);

    }
}
