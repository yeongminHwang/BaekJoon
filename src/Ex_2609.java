import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcd = 1; // 최대공약수
        int lcm = 0; // 최소공배수

        int prime = 2;
        while (lcm == 0) {
            if (num1 % prime == 0 && num2 % prime == 0) {
                num1 = num1 / prime;
                num2 = num2 / prime;

                gcd *= prime;
            } else {
                if (num1 < prime && num2 < prime) {
                    lcm = gcd * num1 * num2;
                    break;
                } else {
                    prime++;
                    while (!isPrime(prime)) {
                        prime++;
                    }
                }
            }
        }

        System.out.println(gcd);
        System.out.println(lcm);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
