import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1065 {
    public static boolean[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        StringTokenizer st = new StringTokenizer(size);

        int input = Integer.parseInt(st.nextToken());

        int han = 0;
        for (int i = 1; i <= input; i++) {
            if (i > 0 && i < 100) {
                han++;
            } else if (i == 1000) {
                break;
            } else {
                int first = i / 100;
                int second = (i / 10) % 10;
                int third = i % 10;
                if (second - first == third - second) {
                    han++;
                }
            }
        }
        System.out.println(han);
    }
}
