import java.io.*;
import java.util.StringTokenizer;

public class Ex_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = "";
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            int s1 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());
            int s3 = Integer.parseInt(st.nextToken());


            if (s1 == 0 || s2 == 0 || s3 == 0) {
                break;
            } else if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
                bw.write("Invalid");
            } else if (s1 == s2 && s2 == s3 && s1 == s3) {
                bw.write("Equilateral");
            } else if (s1 == s2 || s2 == s3 || s1 == s3) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }

            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
