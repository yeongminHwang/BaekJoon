import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack stack = new Stack();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    stack.push(n);
                    break;
                case "pop":
                    sb.append(stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stack.empty()).append("\n");
                    break;
                case "top":
                    sb.append(stack.top()).append("\n");
                    break;
            }

        }
        System.out.println(sb);
    }
}

class Stack {
    private int[] arr = new int[1];
    private int top = -1;

    public void push(int n) {
        if (arr.length - 1 == top) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            this.arr = temp;
        }
        arr[++top] = n;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }

        int target = arr[top];
        arr[top] = 0;
        if ((arr.length - 1) / 2 > top) {
            int[] temp = new int[arr.length / 2];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = arr[i];
            }
            this.arr = temp;
        }
        top--;
        return target;
    }

    public int size() {
        return this.top + 1;
    }

    public int empty() {
        return this.top == -1 ? 1 : 0;
    }

    public int top() {
        return this.top != -1 ? this.arr[top] : -1;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
