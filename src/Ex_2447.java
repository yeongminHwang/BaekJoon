import java.io.*;

public class Ex_2447 {
    static boolean[][] star_table;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        star_table = new boolean[N][N];
        draw(N, 0, 0);

        for (int i = 0; i < star_table.length; i++) {
            for (int j = 0; j < star_table[0].length; j++) {
                if (star_table[i][j]) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public static void draw(int N, int row, int col) {
        if (N == 3) {
            int row_max = row + 3;
            int col_max = col + 3;

            for (int i = row; i < row_max; i++) {
                for (int j = col; j < col_max; j++) {
                    if (i == ((row + row_max) / 2) && j == ((col + col_max) / 2)) {
                        continue;
                    } else {
                        star_table[i][j] = true;
                    }
                }
            }
        } else {
            int row_max =  N + row - 1;
            int col_max = N + col - 1;
            for (int i = row; i < row_max; i += N / 3) {
                for (int j = col; j < col_max; j += N / 3) {
                    if (i == row + (N / 3) && j == col + (N / 3)) {
                        continue;
                    } else {
                        draw(N / 3, i, j);
                    }
                }
            }
        }
    }
}
