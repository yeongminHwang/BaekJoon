import java.io.*;

public class Ex_1003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) {
        try {

            int test_count = Integer.parseInt(br.readLine());

            for (int i = 0; i < test_count; i++) {
                fibonacci(Integer.parseInt(br.readLine()));
            }

            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void fibonacci(int n) throws IOException {
        int a_n0 = 1;
        int a_n1 = 1;

        if (n == 0) {
            bw.write("1 0\n");
        } else if (n == 1) {
            bw.write("0 1\n");
        } else {
            for (int i = 2; i < n; i++) {
                int temp = a_n1;
                a_n1 = a_n0 + a_n1;
                a_n0 = temp;
            }
            bw.write(Integer.valueOf(a_n0) + " " + Integer.valueOf(a_n1) + "\n");
        }
    }
}
