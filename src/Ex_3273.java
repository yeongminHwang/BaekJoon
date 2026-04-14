import java.util.*;
import java.io.*;

public class Ex_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int X = Integer.parseInt(br.readLine());

        int left = 0;
        int right = arr.length - 1;
        int answer = 0;
        while (left < right) {
            int now = arr[left] + arr[right];
            if (now == X) {
                answer++;
                left++;
                right--;
            } else if (now < X) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(answer);
    }
}
