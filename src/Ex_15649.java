import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_15649 {
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

        arr = new int[M]; // 1 ~ M 인덱스 보기 편하라고
        visited = new boolean[N];

        dfs(0);

        System.out.println(sb);
    }

    public static void dfs(int k) {
        if (k == M) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(String.valueOf(arr[i])).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                arr[k] = i + 1;
                visited[i] = true;
                dfs(k + 1);
                visited[i] = false;
            }
        }
        return;
    }
}
