import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int n) {
        if (n >= 2) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        } else {
            return n;
        }
    }
}
