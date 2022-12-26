import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int size = Integer.parseInt(input);

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < size; i++) {
            for(int j=0; j<size-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i: arr) {
            System.out.println(i);
        }
    }
}
