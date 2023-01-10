import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine()); // 60
        int N = Integer.parseInt(br.readLine()); // 100

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

        int sum = 0;
        int min = 0;
        for (int i = M; i < prime_table.length; i++) {
            if (!prime_table[i]) {
                sum += i;
            }
        }

        if (sum == 0) {
            sb.append("-1");
        } else {
            for (int i = M; i < prime_table.length; i++) {
                if (!prime_table[i]) {
                    min = i;
                    break;
                }
            }
            sb.append(sum + "\n" + min);
        }


        System.out.println(sb);

    }
}
