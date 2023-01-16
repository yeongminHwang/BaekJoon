import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        while (!(input = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(input);
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 % num2 == num1) {
                sb.append("factor").append("\n");
            } else if (num1 % num2 == 0) {
                sb.append("multiple").append("\n");
            } else {
                sb.append("neither").append("\n");
            }
        }

        System.out.println(sb);
    }
}
