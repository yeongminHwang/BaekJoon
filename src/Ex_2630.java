import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2630 {
    static int N;
    static int[][] board;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        for (int i = 0; i < board.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, N);

        System.out.println(white);
        System.out.println(blue);

    }

    static void divide(int row, int col, int range) {
        if (check(row, col, range)) {
            if (board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = range / 2;

        divide(row, col, newSize);
        divide(row, col + newSize, newSize);
        divide(row + newSize, col, newSize);
        divide(row + newSize, col + newSize, newSize);

    }

    static boolean check(int row, int col, int range) {
        int max_row = row + range;
        int max_col = col + range;

        int color = board[row][col];

        for (int i = row; i < max_row; i++) {
            for (int j = col; j < max_col; j++) {
                if (board[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

}
