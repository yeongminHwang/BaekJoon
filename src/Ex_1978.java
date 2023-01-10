import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < size; i++) {
            int N = Integer.parseInt(st.nextToken());
            boolean isPrime = true;
            if (N != 1) {
                for (int j = 2; j < N; j++) {
                    if (N % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
            if (isPrime) {
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb);

    }
}
