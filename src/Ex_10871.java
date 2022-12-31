import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int size = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());

        input = br.readLine();
        st = new StringTokenizer(input);
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (standard > num) {
                System.out.print(num + " ");
            }
        }

    }
}
