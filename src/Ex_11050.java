import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (K > N / 2) {
            K = N - K;
        }

        System.out.println(binomial(N, K));
    }

    public static int binomial(int n, int k) {
        int numerator = 1;
        for (int i = n; i > n - k; i--) {
            numerator *= i;
        }
        int denominator = 1;
        for (int i = 1; i <= k; i++) {
            denominator *= i;
        }
        return numerator / denominator;
    }
}
