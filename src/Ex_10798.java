import java.io.*;
import java.util.StringTokenizer;

public class Ex_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] board = new char[5][15];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            for (int j = 0; j < word.length(); j++) {
                board[i][j] = word.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 15; i++) {
                if (board[i][j] != 0) {
                    bw.write(board[i][j]);
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
