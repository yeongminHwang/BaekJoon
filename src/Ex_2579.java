import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2579 {
    static int[] stairs;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int stair_size = Integer.parseInt(br.readLine());
        stairs = new int[stair_size + 1];

        for (int i = 1; i <= stair_size; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        dp = new Integer[stair_size + 1];
        dp[0] = stairs[0];
        dp[1] = stairs[1];

        if (stair_size >= 2) { // 계단 개수가 2개일 때
            dp[2] = stairs[1] + stairs[2];
        }

        System.out.println(climb(stair_size));
    }

    static int climb(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(climb(n - 2), climb(n - 3) + stairs[n - 1]) + stairs[n];
        }
        return dp[n];
    }

}
