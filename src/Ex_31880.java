import java.io.*;
import java.util.StringTokenizer;

public class Ex_31880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N_M = br.readLine();
        StringTokenizer st = new StringTokenizer(N_M);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String n_list = br.readLine();
        st = new StringTokenizer(n_list);
        long P_a = 0L;
        for (int i = 0; i < N; i++) {
            long a = Long.parseLong(st.nextToken());
            P_a += a;
        }

        String m_list = br.readLine();
        st = new StringTokenizer(m_list);
        long P_b = 1L;
        for (int i = 0; i < M; i++) {
            long b = Long.parseLong(st.nextToken());
            if (b > 0) {
                P_b *= b;
            }
        }
        long answer = P_a * P_b;
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
