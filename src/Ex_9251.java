import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_9251 {
    static char[] s1_arr;
    static char[] s2_arr;
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = "0" + br.readLine();
        String s2 = "0" + br.readLine();

        s1_arr = s1.toCharArray();
        s2_arr = s2.toCharArray();
        dp = new Integer[s1.length()][s2.length()];

        for (int i = 0; i < s1_arr.length; i++) {
            for (int j = 0; j < s2_arr.length; j++) {
                LCS(i, j);
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);

    }

    static int LCS(int i, int j) {
        if (dp[i][j] == null) {
            if (i == 0 || j == 0) {
                return dp[i][j] = 0;
            }

            if (s1_arr[i] != s2_arr[j]) {
                dp[i][j] = Math.max(LCS(i - 1, j), LCS(i, j - 1));
            } else {
                dp[i][j] = LCS(i - 1, j - 1) + 1;
            }
        }
        return dp[i][j];
    }
}
