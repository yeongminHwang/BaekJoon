import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] dup_arr = new boolean[42];
        final int INPUT_SIZE = 10;

        int count = 0;
        for (int i = 0; i < INPUT_SIZE; i++) {
            int input_num = Integer.parseInt(br.readLine()) % 42;
            dup_arr[input_num] = true;
        }

        for (int i = 0; i < dup_arr.length; i++) {
            if (dup_arr[i]) {
                count++;
            }
        }

        System.out.println(count);

    }
}
