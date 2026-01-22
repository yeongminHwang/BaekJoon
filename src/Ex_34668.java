import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex_34668 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int BASE_HOUR = 6;
        int BASE_MIN = 0;

        int Q = Integer.parseInt(br.readLine());
        int[] questions = new int[Q];

        for (int i = 0; i < Q; i++) {
            int M = Integer.parseInt(br.readLine());
            questions[0] = M;
            int total_min = getWaitingBusToMin(M);

            int h = total_min / 60;
            int m = total_min % 60;

            String ans_h = ((BASE_HOUR + h) / 10) == 0 ? "0" + (BASE_HOUR + h) : "" + (BASE_HOUR + h);
            String ans_m = ((BASE_MIN + m) / 10) == 0 ? "0" + (BASE_MIN + m) : "" + (BASE_MIN + m);
            bw.write(ans_h + ":" + ans_m);
            bw.flush();
        }
    }

    public static int getWaitingBusToMin(int M) {
        if (M < 50) {
            return 6;
        }
        return ((M / 50) * 12) + 6;
    }
}
