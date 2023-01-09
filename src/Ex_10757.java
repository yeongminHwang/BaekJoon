import java.io.*;
import java.util.StringTokenizer;

public class Ex_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int max_length = Math.max(A.length(), B.length());
        int[] arr_A = new int[max_length + 1];
        int[] arr_B = new int[max_length + 1];

        for (int i = A.length() - 1, idx = 0; i >= 0; i--, idx++) {
            arr_A[idx] = A.charAt(i) - '0';
        }

        for (int i = B.length() - 1, idx = 0; i >= 0; i--, idx++) {
            arr_B[idx] = B.charAt(i) - '0';
        }

        for (int i = 0; i < max_length; i++) {
            int sum = arr_A[i] + arr_B[i];
            arr_A[i + 1] += sum / 10;
            arr_A[i] = sum % 10;
        }

        if (arr_A[max_length] != 0) {
            sb.append(String.valueOf(arr_A[max_length]));
        }
        for (int i = max_length - 1; i >= 0; i--) {
            sb.append(String.valueOf(arr_A[i]));
        }
        System.out.println(sb);
    }
}
