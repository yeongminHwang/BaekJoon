import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();
        int i = 0;
        while (N-- > 0) {
            int seq_num = Integer.parseInt(br.readLine());

            if (seq_num > i) {
                for (int j = i + 1; j <= seq_num; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                i = seq_num;
            } else if (stack.peek() != seq_num) {
                System.out.println("NO");
                System.exit(0);
            }

            stack.pop();
            sb.append("-").append("\n");

        }
        System.out.println(sb);
    }
}
