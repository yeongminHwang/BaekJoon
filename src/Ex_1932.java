import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1932 {
    static int N;
    static int[] arr;
    static int[] dp;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        /**
         *    0     => 1
         *   1 2    => 2
         *  3 4 5   => 3
         * 6 7 8 9  => 4
         */
        int arr_size = 0;
        for (int i = 1; i <= N; i++) {
            arr_size += i;
        }

        arr = new int[arr_size];
        int index = 0;
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                arr[index++] = Integer.parseInt(st.nextToken());
            }
        }

        dp = new int[arr_size];
        System.out.println(getMax(0));

    }

    static int getMax(int n) {
        int cur_level = getLevel(n);
        if (cur_level < N) {
            if (dp[n] == 0) {
                dp[n] = Math.max(getMax(n + cur_level), getMax(n + cur_level + 1)) + arr[n];
            }
        } else {
            return dp[n] = arr[n];
        }

        return dp[n];
    }

    static int getLevel(int n) {
        int i = 1;
        int level = 1;
        while (n >= i) {
            n -= i;
            i++;
            level++;
        }
        return level;
    }
}
