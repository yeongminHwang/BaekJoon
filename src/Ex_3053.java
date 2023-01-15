import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        int r = Integer.parseInt(input);

        double euclid = Math.pow(r, 2) * Math.PI;
        double taxi = Math.pow(Math.sqrt(2) * r, 2);

        System.out.println(euclid);
        System.out.println(taxi);

    }
}
