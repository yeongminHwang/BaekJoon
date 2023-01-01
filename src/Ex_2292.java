import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int destination = Integer.parseInt(input);

        int a1 = 1;
        int i = 1;
        int count = 0;
        while (destination - a1 > 0) {
            destination = destination - a1;
            a1 = 6 * i;
            i++;
        }
        System.out.println(i);


    }
}
