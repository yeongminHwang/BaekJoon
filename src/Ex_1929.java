import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] prime_table = new boolean[N + 1];
        prime_table[0] = true;
        prime_table[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (prime_table[i]) {
                continue;
            }

            for (int j = i * i; j < N + 1; j = j + i) {
                prime_table[j] = true;
            }
        }

        for (int i = M; i <= N; i++) {
            if (!prime_table[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}
