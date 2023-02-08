import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_2805 {
    static int[] tree_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int max = 0;
        int min = 0;

        tree_arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < tree_arr.length; i++) {
            tree_arr[i] = Integer.parseInt(st.nextToken());
            if (max < tree_arr[i]) {
                max = tree_arr[i];
            }
        }

        int height = 0;

        while (min < max) {
            long cut_tree = 0;
            height = (min + max) / 2;

            for (int i = 0; i < tree_arr.length; i++) {
                if (height < tree_arr[i]) {
                    cut_tree += (tree_arr[i] - height);
                }
            }

            if (cut_tree < M) {
                max = height;
            } else {
                min = height + 1;
            }
        }

        System.out.println(min - 1);
    }
}
