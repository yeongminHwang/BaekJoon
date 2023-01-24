import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1463 {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(count_make_one(N));
    }

    static int count_make_one(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(count_make_one(n - 1), Math.min(count_make_one(n / 3), count_make_one(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(count_make_one(n - 1), count_make_one(n / 3)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(count_make_one(n - 1), count_make_one(n / 2)) + 1;
            } else {
                dp[n] = count_make_one(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
