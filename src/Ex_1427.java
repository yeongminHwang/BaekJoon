import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();

        int[] arr = new int[10];
        for (int i = 0; i < N.length(); i++) {
            int num = N.charAt(i) - '0';
            arr[num]++;
        }

        for (int i = 9; i >= 0; i--) {
            int num_count = arr[i];
            for (int j = 0; j < num_count; j++) {
                sb.append(String.valueOf(i));
            }
        }
        System.out.println(sb);
    }
}
