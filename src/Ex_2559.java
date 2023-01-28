import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
        }

        int[] result_arr = new int[N - K + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < result_arr.length; i++) {
            max = Math.max(result_arr[i] = arr[i + K] - arr[i], max);
        }
        System.out.println(max);

    }
}
