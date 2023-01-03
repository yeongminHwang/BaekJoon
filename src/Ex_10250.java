import java.io.*;
import java.util.StringTokenizer;

public class Ex_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        int tc_size = Integer.parseInt(input);

        int[][] tc_arr = new int[tc_size][3];
        for (int i = 0; i < tc_size; i++) {

            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int h = Integer.parseInt(st.nextToken()); // 6
            int w = Integer.parseInt(st.nextToken()); // 12
            int n = Integer.parseInt(st.nextToken()); // 10

            tc_arr[i][0] = h;
            tc_arr[i][1] = w;
            tc_arr[i][2] = n;
        }

        for (int i = 0; i < tc_arr.length; i++) {
            int h = tc_arr[i][0];
            int w = tc_arr[i][1];
            int n = tc_arr[i][2];

            int floor = 0;
            int room = 0;

            if (n % h == 0) {
                floor = h * 100;
                room = n / h;
            } else {
                floor = (n % h) * 100;
                room = n / h + 1;
            }

            String room_num = String.valueOf(floor + room);
            bw.write(room_num + '\n');
            bw.flush();
        }
        bw.close();
    }
}
