import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ex_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet people_set = new HashSet();
        for (int i = 0; i < N; i++) {
            people_set.add(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (people_set.contains(input)) {
                count++;
                sb.append(input).append(" ");
            }
        }

        String[] people_arr = new String[count];
        st = new StringTokenizer(sb.toString());
        for (int i = 0; i < people_arr.length; i++) {
            people_arr[i] = st.nextToken();
        }

        Arrays.sort(people_arr);

        sb = new StringBuilder();
        for (String name : people_arr) {
            sb.append(name).append("\n");
        }

        System.out.println(count);
        System.out.println(sb);

    }
}
