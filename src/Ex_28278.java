import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(st.nextToken());
        Stack_28278 stack = new Stack_28278();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());
            switch (order) {
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x);
//                    stack.print();
                    break;
                case 2:
                    bw.write(String.valueOf(stack.pop()) + '\n');
//                    stack.print();
                    break;
                case 3:
                    bw.write(String.valueOf(stack.getTop()) + '\n');
                    break;
                case 4:
                    bw.write(String.valueOf(stack.isEmpty()) + '\n');
                    break;
                case 5:
                    bw.write(String.valueOf(stack.getTopItem()) + '\n');
                    break;
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}

class Stack_28278 {
    int top;
    int size = 1;
    int[] arr;

    public Stack_28278() {
        arr = new int[size];
        top = 0;
    }

    public void push(int x) {
        arr[top++] = x;
        if (size == top) {
            resize(0);
        }
    }

    public int pop() {
        int result = -1;
        if (top > 0) {
            result = arr[--top];
            arr[top] = 0;
        }
        if (size / 2 > top) {
            resize(1);
        }
        return result;
    }

    public int isEmpty() {
        return (top == 0) ? 1 : 0;
    }

    public int getSize() {
        return size;
    }

    public int getTopItem() {
        return top > 0 ? arr[top - 1] : -1;
    }

    public int getTop() {
        return top > 0 ? top : 0;
    }

    public void resize(int type) {
        int[] temp_arr;
        int item_size = size;
        if (type == 0) { // 증가
            temp_arr = new int[size * 2];
            size = size * 2;
        } else { // 줄이기
            temp_arr = new int[size / 2];
            size = size / 2;
        }

        for (int i = 0; i < top; i++) {
            temp_arr[i] = arr[i];
        }
        arr = temp_arr;
    }

    public void print() {
        System.out.println("Stack Size : " + arr.length + " top : " + top + " isEmpty : " + isEmpty());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
