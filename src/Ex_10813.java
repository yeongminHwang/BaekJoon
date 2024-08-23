import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10813 {
    static int[] bucket;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        bucket = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            bucket[i] = i;
        }
        for (int k = 1; k <= M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            swap(i, j);
        }
        for (int i = 1; i <= N; i++) {
            bw.write(bucket[i] + " ");
        }
        bw.flush();
        bw.close();

    }

    public static void swap(int i, int j) {
        int temp = bucket[i];
        bucket[i] = bucket[j];
        bucket[j] = temp;
    }
}
