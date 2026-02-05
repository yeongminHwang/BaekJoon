import java.io.*;

public class Ex_22351 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        for (int A = 1; A <= 999; A++) {
            String str = Integer.toString(A);
            if (!S.startsWith(str)) {
                continue;
            }

            int B = match(S, A);
            if (B != -1) {
                bw.write(Integer.toString(A) + " " + Integer.toString(B));
                bw.flush();
                return;
            }
        }
    }

    public static int match(String S, int A) {
        int n = S.length();
        int pos = 0;
        for (int i = A; i <= 999; i++) {
            String t = Integer.toString(i);
            for (int j = 0; j < t.length(); j++) {
                if (pos >= n) {
                    return -1;
                }
                if (S.charAt(pos) != t.charAt(j)) {
                    return -1;
                }
                pos++;
            }
            if (pos == n) {
                return i;
            }
        }
        return -1;
    }
}
