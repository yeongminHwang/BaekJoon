import java.io.*;

public class Ex_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N < 10) {
            N = N * 10;
        }

        int count = 0;
        int cycle = -1;
        int num_num = N;
        while (N != cycle) {
            int digit_sum = (num_num / 10) + (num_num % 10);
            if (digit_sum > 9) {
                digit_sum = digit_sum % 10;
            }
            cycle = ((num_num % 10) * 10) + digit_sum;
            num_num = cycle;
            count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
