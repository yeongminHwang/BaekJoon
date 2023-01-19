import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_14889 {
    static int N;
    static int[][] power_table;
    static boolean[] selected;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        power_table = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                power_table[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        selected = new boolean[N + 1];

        make_Team(0, 1);

        System.out.println(min);
    }

    static void make_Team(int depth, int idx) {
        if (depth == N / 2) {
            getPower_gap();
            return;
        }
        for (int i = idx; i <= N; i++) {
            if (!selected[i]) {
                selected[i] = true;
                make_Team(depth + 1, i + 1);

                selected[i] = false;
            }
        }
        return;
    }

    static void getPower_gap() {
        int star_team_power = 0;
        int link_team_power = 0;
        for (int i = 1; i <= N - 1; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (selected[i] && selected[j]) { // star team
                    star_team_power += power_table[i][j] + power_table[j][i];
                }
                if (!selected[i] && !selected[j]) { // link team
                    link_team_power += power_table[i][j] + power_table[j][i];
                }
            }
        }
        int result = Math.abs(star_team_power - link_team_power);

        if (result == 0) {
            System.out.println(0);
            System.exit(0);
        }
        min = Math.min(min, result);
    }
}
