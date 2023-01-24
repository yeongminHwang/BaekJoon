import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex_1920 {
    static int[] N_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        N_arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N_arr.length; i++) {
            N_arr[i] = Integer.parseInt(st.nextToken());
        }


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] M_arr = new int[M];
        for (int i = 0; i < M_arr.length; i++) {
            M_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(N_arr);

        for (int i = 0; i < M_arr.length; i++) {
            if (binarySearch(M_arr[i])) {
                sb.append("1");
            } else {
                sb.append("0");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static boolean binarySearch(int n) {
        int start = 0;
        int end = N_arr.length - 1;

        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (N_arr[mid] == n) {
                return true;
            }

            if (N_arr[mid] > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
