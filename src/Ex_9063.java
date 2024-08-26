import java.io.*;
import java.util.StringTokenizer;

public class Ex_9063 {
    static int[][] coordinate_arr;
    static int min_x;
    static int max_x;
    static int min_y;
    static int max_y;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long result = 0;

        if (N > 1) {
            coordinate_arr = new int[N][2];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                coordinate_arr[i][0] = Integer.parseInt(st.nextToken());
                coordinate_arr[i][1] = Integer.parseInt(st.nextToken());

            }

            max_x = coordinate_arr[0][0];
            min_x = coordinate_arr[0][0];
            min_y = coordinate_arr[0][1];
            max_y = coordinate_arr[0][1];

            for (int i = 0; i < N; i++) {
                if (min_x > coordinate_arr[i][0]) {
                    min_x = coordinate_arr[i][0];
                }

                if (max_x < coordinate_arr[i][0]) {
                    max_x = coordinate_arr[i][0];
                }
                if (min_y > coordinate_arr[i][1]) {
                    min_y = coordinate_arr[i][1];
                }

                if (max_y < coordinate_arr[i][1]) {
                    max_y = coordinate_arr[i][1];
                }

//                System.out.println("min_x : " + min_x + " max_x : " + max_x + " min_y : " + min_y + " max_y : " + max_y);
            }

            result = (max_x - min_x) * (max_y - min_y);

        }
        bw.write(String.valueOf(result));
        bw.flush();
    }
}
