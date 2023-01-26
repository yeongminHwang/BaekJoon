import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Ex_2565 {
    static int[][] lines;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        lines = new int[N][2];
        dp = new Integer[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            lines[i][0] = Integer.parseInt(st.nextToken());
            lines[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lines, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, make_NoCrossLine(i));
        }

        System.out.println(N - max);
    }

    /**
     * 8 2 9 1 4 6 7 10
     * 8
     * 2
     * 2 9
     * 1 9
     * 1 4
     * 1 4 6
     * 1 4 6 7
     * 1 4 6 7 10
     * LIS = 1 1 2 2 2 3 4 5
     * <p>
     * 8
     * 8 2
     * 9 2
     * 9 2 1
     * 9 4 1
     * 9 6 1
     * 9 7 1
     * 10 7 1
     */


    static int make_NoCrossLine(int n) {
        if (dp[n] == null) {
            dp[n] = 1;

            for (int i = n + 1; i < dp.length; i++) {
                if (lines[n][1] < lines[i][1]) {
                    dp[n] = Math.max(dp[n], make_NoCrossLine(i) + 1);
                }
            }
        }
        return dp[n];
    }
}
