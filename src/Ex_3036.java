import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int r0 = Integer.parseInt(st.nextToken());

        int r0_distance = r0 * 2;
        for (int i = 0; i < N - 1; i++) {
            int r = Integer.parseInt(st.nextToken());

            int r_distance = r * 2;

            int gcd = gcd(r_distance, r0_distance);


            sb.append(String.valueOf(r0_distance / gcd)).append("/").append(String.valueOf(r_distance / gcd)).append("\n");
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
}
