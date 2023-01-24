import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1912 {
    static int[] N_arr;
    static Integer[] dp;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N_size = Integer.parseInt(br.readLine());
        N_arr = new int[N_size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N_size; i++) {
            N_arr[i] = Integer.parseInt(st.nextToken());
        }

        dp = new Integer[N_size];

        dp[0] = N_arr[0];
        max = N_arr[0];
        getMax(N_size - 1);

        System.out.println(max);
    }

    static int getMax(int N) {
        if (dp[N] == null) {
            dp[N] = Math.max(getMax(N - 1) + N_arr[N], N_arr[N]);
            max = Math.max(dp[N], max);
        }
        return dp[N];
    }
}
