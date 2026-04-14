import java.io.*;
import java.util.*;


public class Ex_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        long min = Long.MAX_VALUE;
        long answer1 = 0L;
        long answer2 = 0L;
        while (left < right) {
            long sum = arr[left] + arr[right];
            long absSum = Math.abs(sum);

            if (absSum < min) {
                min = absSum;
                answer1 = arr[left];
                answer2 = arr[right];
            }

            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                break;
            }
        }
        System.out.println(answer1 + " " + answer2);
    }
}
