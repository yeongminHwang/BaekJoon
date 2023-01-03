import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Ex_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        long up = Long.parseLong(st.nextToken());
        long down = Long.parseLong(st.nextToken());
        long distance = Long.parseLong(st.nextToken());

        // 하루에 올라갈 수 있는 거리
        long distance_Of_Day = up - down;

        // 무조건 낮에 도착
        long day = (distance - down) / distance_Of_Day;

        if ((distance - up) % distance_Of_Day != 0) {
            day++;
        }
        System.out.println(day);
    }
}
