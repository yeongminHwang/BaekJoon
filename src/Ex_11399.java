import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Ex_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] people = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < people.length; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(people);

        int sum = 0;
        for (int i = 0, j = N; i < people.length; i++, j--) {
            sum += people[i] * j;
        }

        System.out.println(sum);

    }
}
