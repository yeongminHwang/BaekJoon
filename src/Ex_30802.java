import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex_30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(st.nextToken());
        long[] size_arr = new long[6];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size_arr.length; i++) {
            size_arr[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long T = Long.parseLong(st.nextToken());
        long P = Long.parseLong(st.nextToken());

        long shirt = 0;
        for (int i = 0; i < size_arr.length; i++) {
            if (size_arr[i] != 0) {
                if (size_arr[i] % T == 0) {
                    shirt += size_arr[i] / T;
                } else {
                    shirt += size_arr[i] / T + 1;
                }
            }
        }

        long pen = N / P;
        long pen_mod = N % P;

        bw.write(String.valueOf(shirt) + '\n');
        bw.write(String.valueOf(pen) + " " + String.valueOf(pen_mod));
        bw.flush();
    }
}
