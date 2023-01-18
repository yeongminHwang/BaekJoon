import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_9663 {
    static int[] arr;
    static boolean[][] visited;
    static int N;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        visited = new boolean[N][N];

        nQueen(0);

        System.out.println(result);
    }

    static void nQueen(int k) {
        if (k == N) {
            result++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[k] = i; // 열, 행

            if (isPossible(k)) {
                nQueen(k + 1);
            }
        }
    }

    static boolean isPossible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }

}
