import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_11054 {
    static int N;
    static int[] seq;
    static Integer[] lis;
    static Integer[] lds;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        seq = new int[N];
        lis = new Integer[N];
        lds = new Integer[N];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < seq.length; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }


        for (int i = 0; i < N; i++) {
            LIS(i);
            LDS((N - 1) - i);
        }

        for (int i = 0; i < N; i++) {
            max = Math.max(lis[i] + lds[i] - 1, max);
        }

        System.out.println(max);
    }

    static int LIS(int n) {
        if (lis[n] == null) {
            lis[n] = 1;

            for (int i = 0; i < n; i++) {
                if (seq[i] < seq[n]) {
                    lis[n] = Math.max(lis[n], LIS(i) + 1);
                }
            }
        }
        return lis[n];
    }

    static int LDS(int n) {
        if (lds[n] == null) {
            lds[n] = 1;

            for (int i = lds.length - 1; i >= n; i--) {
                if (seq[n] > seq[i]) {
                    lds[n] = Math.max(lds[n], LDS(i) + 1);
                }
            }
        }
        return lds[n];
    }
}
