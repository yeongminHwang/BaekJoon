import java.awt.event.HierarchyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Deque;

public class Ex_5430 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc_size = Integer.parseInt(br.readLine());
        while (tc_size-- > 0) {
            String function_str = br.readLine(); // 함수
            int N = Integer.parseInt(br.readLine()); // 배열 길이
            String N_array = br.readLine(); // String number 배열 값

            Deque<Integer> queue = new ArrayDeque<>();

            function_str = function_str.replaceAll("RR", "");

            String[] temp = N_array.replaceAll("[^0-9]", " ").trim().split(" ");
            for (String val : temp) {
                if (!val.equals("")) {
                    queue.add(Integer.parseInt(val));
                }
            }

            boolean isReverse = false;
            boolean isError = false;
            for (int i = 0; i < function_str.length(); i++) {
                char function = function_str.charAt(i);
                if (function == 'R') {
                    isReverse = !isReverse;
                } else if (function == 'D') {
                    if (!dump(queue, isReverse)) {
                        isError = true;
                        break;
                    }
                }
            }
            if (isError) {
                sb.append("error").append("\n");
            } else {
                print(queue, isReverse);
            }
        }
        System.out.println(sb);
    }

    static void print(Deque queue, boolean isReverse) {
        int queue_size = queue.size();
        sb.append("[");
        while (queue_size-- > 0) {
            if (isReverse) {
                sb.append(String.valueOf(queue.removeLast()));
            } else {
                sb.append(String.valueOf(queue.removeFirst()));
            }
            if (queue_size > 0) {
                sb.append(",");
            }
        }
        sb.append("]").append("\n");
    }

    static boolean dump(Deque queue, boolean isReverse) { // Call by Reference
        if (queue.size() <= 0) {
            return false;
        } else {
            if (isReverse) {
                queue.removeLast();
            } else {
                queue.removeFirst();
            }
            return true;
        }
    }
}
