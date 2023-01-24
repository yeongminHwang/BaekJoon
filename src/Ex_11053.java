import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_11053 {
    static int N;
    static int[] A_arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        A_arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A_arr[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            dp[i] = 1;

            for (int j = 1; j <= i; j++) {
                if (A_arr[i] > A_arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int max = -1;
        for (int i = 1; i <= N; i++) {
            if (dp[i] > max) {
                max = dp[i];
            }
        }

        System.out.println(max);
    }
}
