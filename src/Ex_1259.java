import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = "";
        while (!(input = br.readLine()).equals("0")) {
            boolean isPalindrome = true;
            if (input.length() % 2 == 0) { // 숫자 자리수가 짝수 일때
                int mid = (input.length() / 2) - 1;
                int left = mid;
                int right = mid + 1;

                for (int i = 0; i < input.length() / 2; i++) {
                    if (input.charAt(left - i) != input.charAt(right + i)) {
                        isPalindrome = false;
                        break;
                    }
                }

            } else { // 숫자 자리수가 홀수 일때
                int mid = input.length() / 2;
                int left = mid - 1;
                int right = mid + 1;

                for (int i = 0; i < input.length() / 2; i++) {
                    if (input.charAt(left - i) != input.charAt(right + i)) {
                        isPalindrome = false;
                        break;
                    }
                }
            }

            if (isPalindrome) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
    }
}
