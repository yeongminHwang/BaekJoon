import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[3][2];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr[0].length; i++) {
            if (arr[0][i] == arr[1][i]) {
                sb.append(String.valueOf(arr[2][i])).append(" ");

            } else {
                if (arr[0][i] == arr[2][i]) {
                    sb.append(String.valueOf(arr[1][i])).append(" ");
                } else {
                    sb.append(String.valueOf(arr[0][i])).append(" ");
                }
            }
        }

        System.out.println(sb);
    }
}
