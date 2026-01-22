import java.io.*;
import java.util.StringTokenizer;

public class Ex_28453 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            int level = Integer.parseInt(st.nextToken());

            if (level == 300) {
                bw.write("1 ");
            } else if (level >= 275) {
                bw.write("2 ");
            } else if (level >= 250) {
                bw.write("3 ");
            } else {
                bw.write("4 ");
            }
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
