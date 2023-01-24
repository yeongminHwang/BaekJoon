import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2156 {
    static int[] wines;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        wines = new int[N + 1];
        dp = new Integer[N + 1];
        for (int i = 1; i <= N; i++) {
            wines[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = wines[1];

        if (N >= 2) {
            dp[2] = wines[1] + wines[2];
        }

        System.out.println(drink_max(N));
    }

    /**
     * 연속된 수로 만들 수 있는 최대 수
     * 1 2 3 4 5 6
     * n == 3;
     * dp[3] = Math.max(Math.max(drink_max(1), drink_max(0) + wines[2]) + wines[3], drink_max())
     */
    static int drink_max(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(Math.max(drink_max(n - 2), drink_max(n - 3) + wines[n - 1]) + wines[n], drink_max(n - 1));
        }
        return dp[n];
    }
}
