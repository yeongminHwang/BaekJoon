import java.io.*;
import java.util.StringTokenizer;

public class Ex_19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        boolean isAnswer = false;
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if ((a * x + b * y) == c) {
                    if ((d * x + e * y) == f) {
                        bw.write(x + " " + y);
                        isAnswer = true;
                    }
                }
            }
            if (isAnswer) {
                break;
            }
        }
        bw.close();
        br.close();
    }
}
