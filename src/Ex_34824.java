import java.io.*;

public class Ex_34824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String univ = br.readLine();
            if (univ.equals("korea") || univ.equals("yonsei")) {
                if (univ.equals("yonsei")) {
                    bw.write("Yonsei Won!");
                } else {
                    bw.write("Yonsei Lost...");
                }
                break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
