import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_9184 {
    static int dp[][][] = new int[22][22][22];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        String exit_str = "-1 -1 -1";
        while (!(input = br.readLine()).equals(exit_str)) {
            StringTokenizer st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append("w(" + String.valueOf(a) + ", " + String.valueOf(b) + ", " + String.valueOf(c) + ") = ");

            a = a > 20 ? 21 : a;
            b = b > 20 ? 21 : b;
            c = c > 20 ? 21 : c;

            a = a < 0 ? 0 : a;
            b = b < 0 ? 0 : b;
            c = c < 0 ? 0 : c;

            sb.append(String.valueOf(w(a, b, c))).append("\n");
        }

        System.out.println(sb);
    }

    static int w(int a, int b, int c) {
        if (dp[a][b][c] != 0) {
            return dp[a][b][c];
        }

        if (a <= 0 || b <= 0 || c <= 0) {
            return dp[0][0][0] = 1;

        } else if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        } else if (a < b && b < c) {
            dp[a][b][c - 1] = w(a, b, c - 1);
            dp[a][b - 1][c - 1] = w(a, b - 1, c - 1);
            dp[a][b - 1][c] = w(a, b - 1, c);
            return dp[a][b][c] = dp[a][b][c - 1] + dp[a][b - 1][c - 1] - dp[a][b - 1][c];
        } else {
            dp[a - 1][b][c] = w(a - 1, b, c);
            dp[a - 1][b - 1][c] = w(a - 1, b - 1, c);
            dp[a - 1][b][c - 1] = w(a - 1, b, c - 1);
            dp[a - 1][b - 1][c - 1] = w(a - 1, b - 1, c - 1);
            return dp[a][b][c] = dp[a - 1][b][c] + dp[a - 1][b - 1][c] + dp[a - 1][b][c - 1] - dp[a - 1][b - 1][c - 1];
        }
    }
}
