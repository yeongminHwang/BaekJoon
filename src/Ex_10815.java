import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ex_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        HashSet card_set = new HashSet();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            card_set.add(Integer.parseInt(st.nextToken()));
        }

        int tc_size = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < tc_size; i++) {
            if (card_set.contains(Integer.parseInt(st.nextToken()))) {
                bw.write(String.valueOf(1) + " ");
            } else {
                bw.write(String.valueOf(0) + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
