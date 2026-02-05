import java.io.*;
import java.lang.Math;

public class Ex_33541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(br.readLine());

        int answer = -1;
        for (int i = year + 1; i < 10000; i++) {
            int t =  i / 100;
            int s =  i % 100;

            if (Math.pow(t, 2) + (2 * t * s) + Math.pow(s, 2) == i) {
                answer = i;
                break;
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
