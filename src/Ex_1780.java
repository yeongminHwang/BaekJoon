import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1780 {
    static int N;
    static int[][] paper;
    static int minus_one_cnt = 0;
    static int zero_cnt = 0;
    static int one_cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < paper.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < paper[0].length; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        find(0, 0, N);

        System.out.println(minus_one_cnt);
        System.out.println(zero_cnt);
        System.out.println(one_cnt);
    }

    static void find(int row, int col, int range) {
        if (check(row, col, range)) {
            int expression = paper[row][col];
            switch (expression) {
                case -1:
                    minus_one_cnt++;
                    break;
                case 0:
                    zero_cnt++;
                    break;
                case 1:
                    one_cnt++;
                    break;
            }
            return;
        }
        int newSize = range / 3;

        find(row, col, newSize);
        find(row, col + newSize, newSize);
        find(row, col + 2 * newSize, newSize);

        find(row + newSize, col, newSize);
        find(row + newSize, col + newSize, newSize);
        find(row + newSize, col + 2 * newSize, newSize);

        find(row + 2 * newSize, col, newSize);
        find(row + 2 * newSize, col + newSize, newSize);
        find(row + 2 * newSize, col + 2 * newSize, newSize);

    }

    static boolean check(int row, int col, int range) {
        int max_row = row + range;
        int max_col = col + range;

        int expression = paper[row][col];

        for (int i = row; i < max_row; i++) {
            for (int j = col; j < max_col; j++) {
                if (paper[i][j] != expression) {
                    return false;
                }
            }
        }
        return true;
    }
}
