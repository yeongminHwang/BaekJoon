import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        while ((input = br.readLine()) != null) {
            if (input.charAt(0) == '.') {
                break;
            } else {
                sb.append(check_Balance(input)).append("\n");
            }
        }

        System.out.println(sb);
    }

    static String check_Balance(String input) {
        Stack<Character> stack = new Stack<Character>();
        boolean isBalance = true;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return "no";
                } else {
                    char top = stack.peek();
                    if (top == '(' && ch == ')') {
                        stack.pop();
                    } else if (top == '[' && ch == ']') {
                        stack.pop();
                    } else {
                        return "no";
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
