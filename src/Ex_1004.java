import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc_size = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc_size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());

            int count = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());

                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                double xy1_distance = Math.pow(cx - x1, 2) + Math.pow(cy - y1, 2);
                double xy2_distance = Math.pow(cx - x2, 2) + Math.pow(cy - y2, 2);
                if (xy1_distance < Math.pow(r, 2) && xy2_distance < Math.pow(r, 2)) {
                    continue;
                } else if (xy1_distance < Math.pow(r, 2) || xy2_distance < Math.pow(r, 2)) {
                    count++;
                }
            }
            sb.append(String.valueOf(count)).append("\n");
        }
        System.out.println(sb);
    }
}
