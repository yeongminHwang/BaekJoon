import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();
        String[] subtract_arr = expression.replaceAll("[-]", " ").split(" ");

        for (String val : subtract_arr) {
            String[] add_arr = val.split("[+]");

            int add_sum = 0;
            for (String num_val : add_arr) {
                add_sum += Integer.parseInt(num_val);
            }
        }

        int min = 0;
        String[] add_arr = subtract_arr[0].split("[+]");

        for (int j = 0; j < add_arr.length; j++) {
            min += Integer.parseInt(add_arr[j]);
        }


        for (int i = 1; i < subtract_arr.length; i++) {
            add_arr = subtract_arr[i].split("[+]");

            int add_sum = 0;
            for (int j = 0; j < add_arr.length; j++) {
                add_sum += Integer.parseInt(add_arr[j]);
            }

            min -= add_sum;
        }

        System.out.println(min);

    }
}
