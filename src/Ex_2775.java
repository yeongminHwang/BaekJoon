import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int tc_size = Integer.parseInt(input);

        // 테스트 케이스 입력
        int[][] tc_arr = new int[tc_size][2];
        for (int i = 0; i < tc_size; i++) {
            tc_arr[i][0] = Integer.parseInt(br.readLine());
            tc_arr[i][1] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < tc_size; i++) {
            int k = tc_arr[i][0]; // k층
            int n = tc_arr[i][1]; // n호

            System.out.println(func(k, n));
        }
    }

    public static int func(int k, int n) {
        int sum = 0;
        if (k != 0) {
            for (int i = 1; i <= n; i++) {
                sum += func(k - 1, i);
            }
        } else {
            sum = n;
        }
        return sum;
    }
}
