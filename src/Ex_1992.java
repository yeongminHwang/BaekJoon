import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1992 {
    static int[][] image;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        image = new int[N][N];

        for (int i = 0; i < image.length; i++) {
            char[] char_arr = br.readLine().toCharArray();
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] = char_arr[j] - '0';
            }
        }

        find(0, 0, N);

        System.out.println(sb);
    }

    static void find(int row, int col, int range) {
        if (check(row, col, range)) {
            sb.append(String.valueOf(image[row][col]));
            return;
        } else {
            sb.append("(");
            int newSize = range / 2;
            find(row, col, newSize);
            find(row, col + newSize, newSize);
            find(row + newSize, col, newSize);
            find(row + newSize, col + newSize, newSize);
        }
        sb.append(")");
    }

    static boolean check(int row, int col, int range) {
        int max_row = row + range;
        int max_col = col + range;

        int data = image[row][col];
        for (int i = row; i < max_row; i++) {
            for (int j = col; j < max_col; j++) {
                if (data != image[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
