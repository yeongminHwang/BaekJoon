import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_10844 {
    static Long[][] dp;
    static final long mod = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1L;
        }

        long result = 0L;
        for (int i = 1; i < 10; i++) {
            result += findStairNum(N, i);
        }

        System.out.println(result % mod);
    }

    static long findStairNum(int n, int val) {
        if (n == 1) {
            return dp[n][val];
        }

        if (dp[n][val] == null) {
            if (val == 0) {
                dp[n][val] = findStairNum(n - 1, 1);
            } else if (val == 9) {
                dp[n][val] = findStairNum(n - 1, 8);
            } else {
                dp[n][val] = findStairNum(n - 1, val - 1) + findStairNum(n - 1, val + 1);
            }

        }

        return dp[n][val] % mod;
    }
}
