import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc_size = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc_size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A > B) {
                int temp = A;
                A = B;
                B = temp;
            }

            int lcm = lcm(A, B);
            sb.append(String.valueOf(lcm)).append("\n");
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
