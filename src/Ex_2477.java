import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        int max_width = 0;
        int max_width_index = 0;
        int max_height = 0;
        int max_height_index = 0;
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String direction = st.nextToken();
            int distance = Integer.parseInt(st.nextToken());
            if (direction.equals("4") || direction.equals("3")) {
                if (max_height <= distance) {
                    max_height = distance;
                    max_height_index = i;
                }
            } else {
                if (max_width <= distance) {
                    max_width = distance;
                    max_width_index = i;
                }
            }
            arr[i] = distance;
        }

        int white_box = arr[max_height_index + 3 > arr.length - 1 ? max_height_index - 6 + 3 : max_height_index + 3]
                * arr[max_width_index + 3 > arr.length - 1 ? max_width_index - 6 + 3 : max_width_index + 3];

        int area = arr[max_height_index] * arr[max_width_index] - white_box;

        System.out.println(area * K);
    }
}
