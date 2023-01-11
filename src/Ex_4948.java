import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N;
        while ((N = Integer.parseInt(br.readLine())) != 0) {

            int max = 2 * N;
            boolean[] prime_table = new boolean[max + 1];
            prime_table[0] = true;
            prime_table[1] = true;

            for (int i = 2; i <= Math.sqrt(max); i++) {
                if (prime_table[i]) {
                    continue;
                }

                for (int j = i * i; j < max + 1; j = j + i) {
                    prime_table[j] = true;
                }
            }

            int count = 0;
            for (int i = N + 1; i <= max; i++) {
                if (!prime_table[i]) {
                    count++;
                }
            }
            sb.append(String.valueOf(count)).append("\n");
        }
        System.out.println(sb);
    }
}
