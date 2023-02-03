import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Ex_1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] target_arr = new int[M];

        LinkedList<Integer> deque = new LinkedList<Integer>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < target_arr.length; i++) {
            target_arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int count = 0;
        for (int i = 0; i < M; i++) {
            int target = target_arr[i];
            int target_index = deque.indexOf(target);

            int mid = 0;
            if (deque.size() % 2 == 0) {
                mid = (deque.size() / 2) - 1;
            } else {
                mid = deque.size() / 2;
            }

            if (target_index <= mid) {
                for (int j = 0; j < target_index; j++) {
                    deque.addLast(deque.removeFirst());
                    count++;
                }
            } else {
                for (int j = 0; j < deque.size() - target_index; j++) {
                    deque.addFirst(deque.removeLast());
                    count++;
                }
            }
            deque.removeFirst();
        }
        System.out.println(count);
    }
}
