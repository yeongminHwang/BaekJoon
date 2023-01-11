import java.io.*;

public class Ex_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        int max = 10000;
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

        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(br.readLine());

            int p = n / 2;
            int q = n / 2;

            while (true) {
                if (!prime_table[p] && !prime_table[q]) {
                    sb.append(Integer.toString(p)).append(" ").append(Integer.toString(q)).append("\n");
                    break;
                }
                p--;
                q++;
            }
        }
        System.out.println(sb);
    }
}
