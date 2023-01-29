import java.io.*;
import java.util.StringTokenizer;

public class Ex_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[N + 1];
        long[] mod_arr = new long[M];

        long count = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] += (arr[i - 1] + Integer.parseInt(st.nextToken())) % M;
            if (arr[i] == 0) {
                count++;
            }
            mod_arr[(int) arr[i]]++;
        }

        for (int i = 0; i < mod_arr.length; i++) {
            if (mod_arr[i] > 1) {
                count += (mod_arr[i] * (mod_arr[i] - 1)) / 2;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
