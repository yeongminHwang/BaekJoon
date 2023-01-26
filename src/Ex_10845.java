import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue queue = new Queue();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    queue.push(n);
                    break;
                case "pop":
                    sb.append(queue.pop()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.empty()).append("\n");
                    break;
                case "front":
                    sb.append(queue.front()).append("\n");
                    break;
                case "back":
                    sb.append(queue.back()).append("\n");
                    break;
            }

        }
        System.out.println(sb);

    }
}

class Queue {
    private int[] arr = new int[10001];
    private int front = 0;
    private int back = 0;

    public void push(int n) {
        arr[back++] = n;
    }

    public int pop() {
        if (back == front) {
            return -1;
        } else {
            int target = arr[front++];
            return target;
        }
    }

    public int size() {
        return back - front;
    }

    public int empty() {
        return back == front ? 1 : 0;
    }

    public int front() {
        return back == front ? -1 : arr[front];
    }

    public int back() {
        return back == front ? -1 : arr[back - 1];
    }

}

