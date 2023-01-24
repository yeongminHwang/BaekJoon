import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1149 {
    static int[][] color_cost;
    static int[][] dp;
    static final int red = 0;
    static final int green = 1;
    static final int blue = 2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        color_cost = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            color_cost[i][0] = Integer.parseInt(st.nextToken());
            color_cost[i][1] = Integer.parseInt(st.nextToken());
            color_cost[i][2] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N][3];
        dp[0][red] = color_cost[0][red];
        dp[0][green] = color_cost[0][green];
        dp[0][blue] = color_cost[0][blue];

        int min = Math.min(Math.min(getMin_Color_Cost(N - 1, red), getMin_Color_Cost(N - 1, green)), getMin_Color_Cost(N - 1, blue));
        System.out.println(min);
    }

    static int getMin_Color_Cost(int n, int color) {
        if (dp[n][color] == 0) {
            if (color == red) {
                dp[n][color] = Math.min(getMin_Color_Cost(n - 1, 1), getMin_Color_Cost(n - 1, 2)) + color_cost[n][color];
            } else if (color == green) {
                dp[n][color] = Math.min(getMin_Color_Cost(n - 1, 0), getMin_Color_Cost(n - 1, 2)) + color_cost[n][color];
            } else if (color == blue) {
                dp[n][color] = Math.min(getMin_Color_Cost(n - 1, 0), getMin_Color_Cost(n - 1, 1)) + color_cost[n][color];
            }
        }
        return dp[n][color];
    }
}
