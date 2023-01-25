import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc_size = Integer.parseInt(br.readLine());

        while (tc_size-- > 0) {
            String input = br.readLine();

            Stack<Character> stack = new Stack<Character>();

            char[] ps_arr = input.toCharArray();
            boolean isValid = true;
            for (int i = 0; i < ps_arr.length; i++) {
                if (ps_arr[i] == '(') {
                    stack.push(ps_arr[i]);
                } else if (ps_arr[i] == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid && stack.size() == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
    }
}
