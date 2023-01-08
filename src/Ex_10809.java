import java.io.*;

public class Ex_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        for (int i = 0; i < 26; i++) {
            int index = -1;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == i + 'a') {
                    index = j;
                    break;
                }
            }
            bw.write(String.valueOf(index) + " ");
        }
        bw.flush();
        bw.close();
    }
}
