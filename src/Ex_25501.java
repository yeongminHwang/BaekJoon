import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ex_25501 {
    static int recursion_cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc_size = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc_size; i++) {
            String input = br.readLine();
            sb.append(isPalindrome(input)).append(" ").append(String.valueOf(recursion_cnt)).append("\n");
            recursion_cnt = 0;
        }
        System.out.println(sb);
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static int recursion(String s, int l, int r) {
        recursion_cnt++;
        if (l >= r) {
            return 1;
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l + 1, r - 1);
        }
    }
}
