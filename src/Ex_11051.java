import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_11051 {
    static int[][] arr;
    static final int div = 10007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][K + 1];

        System.out.println(getBinomial(N, K));

    }

    public static int getBinomial(int n, int k) {
        if (n == k || k == 0) {
            return arr[n][k] = 1;
        }

        if (arr[n][k] > 0) {
            return arr[n][k];
        }


        return arr[n][k] = (getBinomial(n - 1, k - 1) + getBinomial(n - 1, k)) % div;
    }
}
