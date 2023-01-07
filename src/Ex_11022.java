import java.io.*;
import java.util.StringTokenizer;

public class Ex_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int size = Integer.parseInt(input);

        StringTokenizer st;
        for (int i = 0; i < size; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = A + B;

            bw.write("Case #" + (i + 1) + ": " + A + " + " + B + " = " + C + "\n");
        }
        bw.flush();
        bw.close();
    }
}
