import java.io.*;
import java.util.StringTokenizer;

public class Ex_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr[i] += arr[i - 1];
        }

        /**
         * 누적합 Prefix Sum
         * 배열에 각 인덱스까지의 누적합을 계산해 놓고,
         * 끝범위 인덱스 - (시작범위 인덱스 -1)까지
         * 부분합을 O(1)에 구할 수 있음
         */

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(arr[j] - arr[i - 1]));
            bw.write("\n");

        }

        bw.flush();
        bw.close();
    }
}
