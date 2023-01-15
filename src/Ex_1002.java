import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc_size = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc_size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(getContact(x1, y1, r1, x2, y2, r2)).append("\n");
        }

        System.out.println(sb);
    }

    public static int getContact(int x1, int y1, int r1, int x2, int y2, int r2) {

        double distance = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        // 원 2개가 완전 같을 때 접점의 개수 무한대
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        // 접하지 않을 때
        else if (distance > Math.pow(r1 + r2, 2)) {
            return 0;
        } else if (distance < Math.pow(r2 - r1, 2)) {
            return 0;
        }

        // 접할 때 1개 , 내접
        else if (distance == Math.pow(r2 - r1, 2)) {
            return 1;
        }
        // 접할 때 1개, 외접
        else if (distance == Math.pow(r1 + r2, 2)) {
            return 1;
        } else {
            return 2;
        }

    }
}
