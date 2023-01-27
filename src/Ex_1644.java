import java.io.*;
import java.util.ArrayList;

public class Ex_1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());

        boolean[] prime_table = new boolean[N + 1];
        prime_table[0] = prime_table[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!prime_table[i]) {
                for (int j = i * i; j <= N; j += i) {
                    prime_table[j] = true;
                }
            }
        }

        for (int i = 0; i < prime_table.length; i++) {
            if (!prime_table[i]) {
                arrayList.add(i);
            }
        }

        int sum = 2;
        int left = 0;
        int right = 0;
        int ans = 0;
        int size = arrayList.size();
        while (left < size && right < size) {
            if (sum == N) {
                ans++;
                sum -= arrayList.get(left);
                left++;
            } else if (sum > N) {
                sum -= arrayList.get(left);
                left++;
            } else {
                right++;
                if (right >= size) {
                    break;
                }
                sum += arrayList.get(right);
            }
        }
        bw.write(String.valueOf(ans) + "\n");
        bw.flush();
        bw.close();
    }
}
