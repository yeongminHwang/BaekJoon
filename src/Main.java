import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        int size = Integer.parseInt(st.nextToken());
        int[] arr = new int[size];

        input = br.readLine();
        st = new StringTokenizer(input);

        float max = -1;
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]) {
                max = arr[i];
            }
        }

        float sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += (arr[i] / max) * 100;
        }
        System.out.println(sum / arr.length);

    }
}
