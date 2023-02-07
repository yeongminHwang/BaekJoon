import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lan_cnt_arr = new int[K];
        long max = 0;
        for (int i = 0; i < lan_cnt_arr.length; i++) {
            lan_cnt_arr[i] = Integer.parseInt(br.readLine());
            if (max < lan_cnt_arr[i]) {
                max = lan_cnt_arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;

            long count = 0;
            for (int i = 0; i < lan_cnt_arr.length; i++) {
                count += (lan_cnt_arr[i] / mid);
            }

            if (count < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }

}
