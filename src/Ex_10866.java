import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque deque = new Deque();


        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push_front": {
                    int n = Integer.parseInt(st.nextToken());
                    deque.push_front(n);
                    break;
                }
                case "push_back": {
                    int n = Integer.parseInt(st.nextToken());
                    deque.push_back(n);
                    break;
                }
                case "pop_front":
                    sb.append(deque.pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deque.pop_back()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.empty()).append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "front":
                    sb.append(deque.front()).append("\n");
                    break;
                case "back":
                    sb.append(deque.back()).append("\n");
                    break;

            }
        }
        System.out.println(sb);
    }
}

class Deque {
    private int[] arr = new int[10000];
    private int front = 0;
    private int back = 0;
    private int size = 0;

    public void push_front(int n) {
        arr[front] = n;
        front = (front - 1 + arr.length) % arr.length;
        size++;
    }

    public void push_back(int n) {
        back = (back + 1) % arr.length;
        arr[back] = n;
        size++;
    }

    public int pop_front() {
        if (size == 0) {
            return -1;
        }
        int ret = arr[(front + 1) % arr.length];
        front = (front + 1) % arr.length;
        size--;
        return ret;
    }

    public int pop_back() {
        if (size == 0) {
            return -1;
        }

        int ret = arr[back];
        back = (back - 1 + arr.length) % arr.length;
        size--;
        return ret;
    }

    public int size() {
        return size;
    }

    public int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    public int front() {
        if (size == 0) {
            return -1;
        }
        return arr[(front + 1) % arr.length];
    }

    public int back() {
        if (size == 0) {
            return -1;
        }
        return arr[back];
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
