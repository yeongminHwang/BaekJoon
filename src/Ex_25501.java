import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ex_25501 {
    static int recursion_cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            recursion_cnt = 0;
            String str = br.readLine();
            sb.append(isPalindrome(str)).append(" ").append(recursion_cnt).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int isPalindrome(String s) {
        return recursion(s, 0, s.length() - 1);
    }

    public static int recursion(String s, int l, int r) {
        recursion_cnt++;
        if (l >= r) {
            return 1;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return 0;
        }
        return recursion(s, l + 1, r - 1);
    }
}
