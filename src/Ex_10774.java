import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex_10774 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();

        while (K-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                if (stack.size() == 0) {
                    continue;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(num);
            }
        }

        long result = 0;
        if (stack.size() != 0) {
            while (stack.size() != 0) {
                result += stack.pop();
            }
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
