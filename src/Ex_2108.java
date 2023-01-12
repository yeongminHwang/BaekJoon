import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int sum = 0;
        int max = -4001;
        int min = 4000;
        int[] counting_arr = new int[8001];
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            counting_arr[num + 4000]++;
            sum += num;

            if (max < num) {
                max = num;
            }

            if (min > num) {
                min = num;
            }
        }

        int count = 0;
        int middle = 0;
        int mode_max = 0;
        int mode = 0;
        boolean isFirst = true;
        for (int i = min + 4000; i <= max + 4000; i++) {
            if (counting_arr[i] > 0) {

                if (count < (size +1) / 2) {
                    count += counting_arr[i];
                    middle = i - 4000;
                }

                if (mode_max < counting_arr[i]) {
                    mode_max = counting_arr[i];
                    mode = i - 4000;
                    isFirst = false;
                } else if (mode_max == counting_arr[i] && !isFirst) {
                    mode = i - 4000;
                    isFirst = true;
                }

            }

        }

        System.out.println((int) Math.round((double) sum / (double) size)); // 산술평균
        System.out.println(middle); // 중앙값
        System.out.println(mode); // 최빈값
        System.out.println(max - min); // 범위
    }
}
