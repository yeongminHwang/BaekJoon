import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc_length = 5;

        int sum = 0;
        int[] arr = new int[tc_length];
        for (int i = 0; i < tc_length; i++) {
            sum += arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(sum / tc_length); // average
        System.out.println(arr[(tc_length / 2)]); // middle

    }
}
