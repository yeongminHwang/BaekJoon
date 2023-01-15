import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap pokemon_map = new HashMap(); // key -
        String[] pokemon_arr = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            String input = br.readLine();
            pokemon_arr[i] = input;
            pokemon_map.put(input, i);
        }

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            if (isDigit(input)) {
                sb.append(pokemon_arr[Integer.parseInt(input)]).append("\n");
            } else {
                sb.append(pokemon_map.get(input)).append("\n");
            }
        }

        System.out.println(sb);

    }

    public static boolean isDigit(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
