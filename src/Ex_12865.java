import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex_12865 {
    static int[][] objects;
    static Integer[][] dp;
    static int N;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 물건의 개수
        K = Integer.parseInt(st.nextToken()); // 최대 가질 수 있는 무게

        objects = new int[N][2];
        dp = new Integer[N][K + 1];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            objects[i][0] = Integer.parseInt(st.nextToken()); // 무게
            objects[i][1] = Integer.parseInt(st.nextToken()); // 가치
        }

        System.out.println(select(N - 1, K));
    }

    static int select(int n, int k) {
        if (n < 0) {
            return 0;
        }
        if (dp[n][k] == null) {

            if (objects[n][0] > k) {
                dp[n][k] = select(n - 1, k);
            } else if (objects[n][0] <= k) {
                dp[n][k] = Math.max(select(n - 1, k), select(n - 1, k - objects[n][0]) + objects[n][1]);
            }
        }
        return dp[n][k];
    }
}
