import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex_2981 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int val = arr[1] - arr[0];

        for (int i = 2; i < arr.length; i++) {
            val = gcd(val, arr[i] - arr[i - 1]);
        }

        for (int i = 2; i <= val; i++) {
            if (val % i == 0) {
                sb.append(i).append(" ");
            }
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
