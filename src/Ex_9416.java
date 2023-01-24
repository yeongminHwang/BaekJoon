import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_9416 {
    static long p[] = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc_size = Integer.parseInt(br.readLine());

        p[1] = p[2] = p[3] = 1;
        p[4] = p[5] = 2;

        while (tc_size-- > 0) {
            int N = Integer.parseInt(br.readLine());
            sb.append(String.valueOf(getP(N))).append("\n");
        }
        System.out.println(sb);
    }

    static long getP(int N) {
        if (p[N] != 0) {
            return p[N];
        }

        if (N < 9) {
            p[N] = getP(N - 1) + getP(3);
        } else {
            p[N] = getP(N - 1) + getP(N - 5);
        }
        return p[N];
    }
}
