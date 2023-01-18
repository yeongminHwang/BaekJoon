import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_15650 {
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visited = new boolean[N + 1];

        dfs(N, M, 0, 0);

        System.out.println(sb);
    }

    public static void dfs(int N, int M, int k, int condition) {
        if (k == M) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(String.valueOf(arr[i])).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && i > condition) {
                visited[i] = true;
                arr[k] = i;
                dfs(N, M, k + 1, i);
                visited[i] = false;
            }
        }
        return;
    }
}
