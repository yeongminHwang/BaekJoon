import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int asc = input.charAt(i) - 'A';
            int time = asc / 3 + 3;
            if (asc == 18 || asc == 21 || asc == 24 || asc == 25) {
                time -= 1;
            }
            sum += time;
        }
        bw.write(String.valueOf(sum) + '\n');

        bw.close();
        br.close();
    }
}