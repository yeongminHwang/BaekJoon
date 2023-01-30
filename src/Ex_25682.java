import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_25682 {
    static BufferedReader br;
    static char[][] board;
    static int N;
    static int M;
    static int K;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        board = new char[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = str.charAt(j - 1);
            }
        }

        System.out.println(Math.min(find('W'), find('B')));
    }

    static int find(char start_color) {
        int[][] prefix_sum = new int[N + 1][M + 1];
        int min = Integer.MAX_VALUE;

        int color = start_color == 'B' ? 0 : 1;
        int val;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if ((board[i][j] == 'B' ? 0 : 1) != color) {
                    val = 1;
                } else {
                    val = 0;
                }
                prefix_sum[i][j] = prefix_sum[i][j - 1] + prefix_sum[i - 1][j] - prefix_sum[i - 1][j - 1] + val;

                color = color == 0 ? 1 : 0;
            }
            if (M % 2 == 0) {
                color = color == 0 ? 1 : 0;
            }
        }


        for (int i = 1; i <= N - K + 1; i++) {
            for (int j = 1; j <= M - K + 1; j++) {
                min = Math.min(min, prefix_sum[i + K - 1][j + K - 1] - prefix_sum[i - 1][j + K - 1] - prefix_sum[i + K - 1][j - 1] + prefix_sum[i - 1][j - 1]);
            }
        }
        return min;
    }
}
