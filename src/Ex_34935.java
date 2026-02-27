import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_34935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String A = br.readLine();
        String[] A_arr = A.split(" ");

        for (int i = 0; i < N - 1; i++) {
            String now = A_arr[i];
            String next = A_arr[i + 1];
            if (now.equals(next)) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
