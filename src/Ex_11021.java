import java.io.*;
import java.util.StringTokenizer;

public class Ex_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int size = Integer.parseInt(input);

        StringTokenizer st;
        for (int i = 0; i < size; i++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            bw.write("Case #" + (i + 1) + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
