import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int result = 0;
        for (int i=1; i<=num; i++) {
            int target = i;
            int constructor = 0;

            while (target > 0) {
                int pos_num = target % 10;
                target = target / 10;
                constructor += pos_num;
            }

            if (constructor + i == num) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
