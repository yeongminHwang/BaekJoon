import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_15652 {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N + 1];

        dfs(0, 0);

        System.out.println(sb);
    }

    static void dfs(int k, int condition) {
        if (k == M) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(String.valueOf(arr[i])).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && i >= condition) {
                arr[k] = i;
                dfs(k + 1, i);
            }
        }
        return;
    }
}
