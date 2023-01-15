import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> card_map = new HashMap<String, Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String input = st.nextToken();
            if (card_map.containsKey(input)) {
                card_map.put(input, card_map.get(input) + 1);
            } else {
                card_map.put(input, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            String input = st.nextToken();
            if (card_map.containsKey(input)) {
                sb.append(String.valueOf(card_map.get(input))).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }

        System.out.println(sb);
    }
}
