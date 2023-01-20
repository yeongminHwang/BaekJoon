import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_24416 {
    static int[] fib_memoization;
    static int fib_count = 0;
    static int dp_fib_count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        fib_memoization = new int[N + 1];
        fib_memoization[1] = 1;
        fib_memoization[2] = 1;

        fib(N);
        fibonacci(N);

        System.out.println(fib_count + " " + dp_fib_count);

    }

    static int fib(int n) {
        if (n < 3) {
            fib_count++;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    static int fibonacci(int n) {
        if (fib_memoization[n] != 0) {
            return fib_memoization[n];
        }
        dp_fib_count++;
        return fib_memoization[n] = fibonacci(n - 1) + fibonacci(n - 2);

    }
}
