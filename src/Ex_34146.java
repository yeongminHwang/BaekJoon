import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex_34146 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (M == 1 && N == 1) {
            System.out.println("YES");
            return;
        }

        if (N == 1 && M % 2 == 0) {
            System.out.println("YES");
            return;
        }

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                String A = st.nextToken();
                if (map.containsKey(A)) {
                    map.put(A, map.get(A) + 1);
                } else {
                    map.put(A, 1);
                }
            }
        }

        if (M % 2 == 1) {
            M--;
        }
        int pairTile = N * M;
        int pairCount = 0;

        Object[] keys = map.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            int value = map.get((String) keys[i]);
            if (value / 2 > 0) {
                if (value % 2 == 0) {
                    pairCount += value;
                } else {
                    pairCount += value - 1;
                }
            }
        }
        System.out.println(pairCount);

        if (pairCount >= pairTile) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
