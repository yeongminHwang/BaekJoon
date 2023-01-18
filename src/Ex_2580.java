import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2580 {
    static final int SUDOKU_SIZE = 9;
    static int[][] sudoku = new int[SUDOKU_SIZE][SUDOKU_SIZE];
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int zero_count = 0;
        for (int i = 0; i < sudoku.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < sudoku[0].length; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 0) {
                    zero_count++;
                }
                sudoku[i][j] = num;
            }
        }

        arr = new int[zero_count];

        dfs(0, 0);

        System.out.println(sb);
    }

    public static void dfs(int row, int col) {
        if (col == 9) {
            dfs(row + 1, 0);
            return;
        }
        if (row == 9) {
            for (int i = 0; i < SUDOKU_SIZE; i++) {
                for (int j = 0; j < SUDOKU_SIZE; j++) {
                    sb.append(String.valueOf(sudoku[i][j])).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }
        if (sudoku[row][col] == 0) {
            for (int i = 1; i <= SUDOKU_SIZE; i++) {
                if (isPossible(i, row, col)) {
                    sudoku[row][col] = i;
                    dfs(row, col + 1);
                }
            }
            sudoku[row][col] = 0;
            return;
        } else {
            dfs(row, col + 1);
        }
    }

    static boolean isPossible(int num, int row, int col) {
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (sudoku[row][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (sudoku[i][col] == num) {
                return false;
            }
        }


        int m_start_row = row - (row % 3); // 2 - 2 = 0
        int m_start_col = col - (col % 3); //
        for (int i = m_start_row; i < m_start_row + 3; i++) {
            for (int j = m_start_col; j < m_start_col + 3; j++) {
                if (sudoku[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}
