import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tc_size = Integer.parseInt(br.readLine());

        int paper_size = 100;
        boolean[][] paper = new boolean[paper_size][paper_size];

        // 원점이 (99, 0);
        int black_size = 10;
        for (int i = 0; i < tc_size; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = (paper_size - 1) - Integer.parseInt(st.nextToken());
            for (int j = y; j > y - black_size; j--) {
                for (int k = x; k < x + black_size; k++) {
                    paper[j][k] = true;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < paper_size; i++) {
            for (int j = 0; j < paper_size; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}
