import java.io.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Ex_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        StringTokenizer st;
        try {
            while ((input = br.readLine()) != null) {
                st = new StringTokenizer(input);
                bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
            }
        } catch (NoSuchElementException e) {
            bw.flush();
        } finally {
            bw.close();
        }
    }
}
