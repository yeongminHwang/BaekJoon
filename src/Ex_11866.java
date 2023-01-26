import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<Integer>();
        Queue<Integer> result = new LinkedList<Integer>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int count = 0;
        int k_count = 0;
        sb.append("<");
        while (count < N) {
            int backward = queue.poll();
            k_count++;
            if (k_count == K) {
                if (count + 1 == N) {
                    sb.append(backward).append(">");
                } else {
                    sb.append(backward).append(", ");
                }
                count++;
                k_count = 0;
            } else {
                queue.add(backward);
            }
        }

        System.out.println(sb);
    }
}
