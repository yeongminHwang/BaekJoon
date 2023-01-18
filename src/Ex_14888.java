import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_14888 {
    static int N;
    static int[] arr; // 수열 담을 배열
    static int[] operator; // 연산자 개수 저장하는 배열
    static int[] operator_combination;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        operator = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operator.length; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        operator_combination = new int[N - 1];
        make_Expression(0);

        System.out.println(max);
        System.out.println(min);
    }

    static void make_Expression(int depth) {
        if (depth == N - 1) {
            int result = calculate(arr[0], arr[1], operator_combination[0]);
            for (int i = 1; i < arr.length - 1; i++) {
                result = calculate(result, arr[i + 1], operator_combination[i]);
            }

            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for (int i = 0; i < operator.length; i++) {
            if (operator[i] != 0) {
                operator[i] = operator[i] - 1;
                operator_combination[depth] = i;

                make_Expression(depth + 1);

                operator[i] = operator[i] + 1;
            }
        }
        return;
    }

    static int calculate(int a, int b, int operator_type) {
        switch (operator_type) {
            case 0: // 덧셈
                return a + b;
            case 1: // 뺄셈
                return a - b;
            case 2: // 곱셈
                return a * b;
            case 3: // 나눗셈
                return a / b;
            default:
                return -1;
        }
    }
}
