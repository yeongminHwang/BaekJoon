import java.io.*;
import java.util.*;

public class Ex_34554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            int count = 0;
            StringBuilder pair_sb = new StringBuilder();
            StringBuilder count_sb = new StringBuilder();
            for (int A = 1; A <= N; A++) {
                for (int B = A + 1; B - A <= N; B++) {
                    // A가 1이면
                    int prime_target = A * B;
//                    System.out.println(prime_target);
                    if (!isPrime(prime_target)) {
                        break;
                    } else {
                        count++;
                        pair_sb.append(A + " " + B + "\n");
                    }
                }
            }
            count_sb.append(count + "\n");
            bw.write(count_sb.toString());
            bw.write(pair_sb.toString());
        }
        bw.flush();
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
