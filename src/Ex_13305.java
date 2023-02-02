import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int city_count = Integer.parseInt(br.readLine());
        long[] distance_arr = new long[city_count - 1];
        long[] gas_per_city = new long[city_count];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distance_arr.length; i++) {
            distance_arr[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < gas_per_city.length; i++) {
            gas_per_city[i] = Long.parseLong(st.nextToken());
        }

        long sum = 0;
        long minGas = gas_per_city[0];
        for (int i = 0; i < city_count - 1; i++) {

            if (minGas > gas_per_city[i]) {
                minGas = gas_per_city[i];
            }

            sum += minGas * distance_arr[i];
        }
        System.out.println(sum);
    }
}
