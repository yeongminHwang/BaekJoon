import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int matrix_size = 9;
        int[][] matrix = new int[matrix_size][matrix_size];
        for (int i = 0; i < matrix_size; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < matrix_size; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] result = new int[3];
        for (int i = 0; i < matrix_size; i++) {
            for (int j = 0; j < matrix_size; j++) {
                if (matrix[i][j] >= result[0]) {
                    result[0] = matrix[i][j];
                    result[1] = i + 1;
                    result[2] = j + 1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(result[0]).append("\n");
        sb.append(result[1]).append(" ").append(result[2]);
        System.out.println(sb);
    }
}
