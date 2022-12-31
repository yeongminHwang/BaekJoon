import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int target = Integer.parseInt(br.readLine());
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
