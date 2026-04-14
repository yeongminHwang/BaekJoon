import java.io.*;
import java.util.*;

public class Ex_21967 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] cnt = new int[11];
        int l = 0;
        int ans = 0;

        for (int r = 0; r < N; r++) {
            cnt[arr[r]]++;

            while (true) {
                int minVal = 1;
                while (minVal <= 10 && cnt[minVal] == 0) {
                    minVal++;
                }

                int maxVal = 10;
                while (maxVal >= 1 && cnt[maxVal] == 0) {
                    maxVal--;
                }

                if (maxVal - minVal <= 2) {
                    break;
                }

                cnt[arr[l]]--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }

        bw.write(String.valueOf(ans));
        bw.flush();
    }
}
