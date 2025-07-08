import java.io.*;
import java.util.StringTokenizer;


public class Ex_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket_arr = new int[N];
        for (int i = 0; i < bucket_arr.length; i++) {
            bucket_arr[i] = i + 1;
        }
        for (int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if (i < j) {
                int[] copy_bucket_arr = new int[j - i + 1];
                for (int q = 0; q < copy_bucket_arr.length; q++) {
                    copy_bucket_arr[q] = bucket_arr[j - 1 - q];
                }
                int l = 0;
                for (int q = i - 1; q <= j - 1; q++) {
                    bucket_arr[q] = copy_bucket_arr[l];
                    l++;
                }
            }
        }
        for (int k = 0; k < bucket_arr.length; k++) {
            bw.write(bucket_arr[k] + " ");
        }
        bw.flush();
    }
}
