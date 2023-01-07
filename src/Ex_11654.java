import java.io.*;

public class Ex_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(String.valueOf(input.charAt(0) + 0));
        bw.flush();
        bw.close();
    }
}
