import java.io.*;
import java.util.StringTokenizer;

public class Ex_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[][] matrix = new long[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                matrix[i][j] += matrix[i][j - 1] + Integer.parseInt(st.nextToken());
            }
        }


        while (M-- > 0) {
            long result = 0;
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int i = x1; i <= x2; i++) {
                result += matrix[i][y2] - matrix[i][y1 - 1];
            }

            bw.write(String.valueOf(result));
            bw.write("\n");

        }

        bw.flush();
        bw.close();
    }
}
