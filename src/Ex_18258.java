import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Queue_v2 queue = new Queue_v2();
        while (N-- > 0) {
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
                case "empty":
                    sb.append(queue.empty()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
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

class Queue_v2 {
    private int[] arr = new int[2000000];
    private int front = 0;
    private int back = 0;


    public void push(int n) {
        arr[back++] = n;
    }

    public int pop() {
        if (front == back) {
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
        return front == back ? 1 : 0;
    }

    public int front() {
        return front == back ? -1 : arr[front];
    }

    public int back() {
        return front == back ? -1 : arr[back - 1];
    }

}