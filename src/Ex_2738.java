import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        int[][] A = new int[row][col];
        int[][] B = new int[row][col];

        for (int i = 0; i < A.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < B.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sb.append(Integer.toString(A[i][j] + B[i][j])).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
