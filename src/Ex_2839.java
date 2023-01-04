import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);

        int result = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                N -= 5;
                result++;
            } else {
                N -= 3;
                result++;
            }
        }

        if (N < 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
        // System.out.println(func(N));

    }

    // 재귀 방식 DP
    public static int func(int N) {
        if (N < 0) {
            return -1;
        } else if (N == 0) {
            return 0;
        } else {
            int five = func(N - 5);
            int three = func(N - 3);
            int result = 1;

            if (five < 0 && three < 0) {
                return -1;
            }

            if (five < 0 || three < 0) {
                result = five - three > 0 ? five : three;
            } else {
                result = five <= three ? five : three;
            }
            return result;
        }
    }
}
