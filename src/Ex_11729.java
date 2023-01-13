import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_11729 {
    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 2, 3);
        System.out.println(count);
        System.out.println(sb);
    }

    public static void hanoi(int N, int left, int mid, int right) {
        count++;
        if (N == 1) {
            sb.append(left).append(" ").append(right).append('\n');
            return;
        }

        hanoi(N - 1, left, right, mid);

        sb.append(left).append(" ").append(right).append("\n");

        hanoi(N - 1, mid, left, right);
    }
}
