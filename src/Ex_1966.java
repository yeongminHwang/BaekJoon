import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Queue;

public class Ex_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc_size = Integer.parseInt(br.readLine());

        while (tc_size-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<int[]>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] front = queue.poll();
                boolean isMax = true;

                for (int i = 0; i < queue.size(); i++) {
                    int[] remain_task = queue.poll();
                    if (front[1] < remain_task[1]) {
                        isMax = false;
                    }
                    queue.add(remain_task);
                }

                if (!isMax) {
                    queue.add(front);
                } else {
                    count++;
                    if (front[0] == M) {
                        System.out.println(count);
                    }
                }
            }
        }
    }
}
