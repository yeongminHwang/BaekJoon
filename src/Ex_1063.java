import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        char[] king = st.nextToken().toCharArray();
        char[] stone = st.nextToken().toCharArray();
        int move_cnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < move_cnt; i++) {
            String move = br.readLine();
            char[] next_king = move(move, king);
            if (isInRange(next_king)) {
                if (next_king[0] == stone[0] && next_king[1] == stone[1]) {
                    char[] next_stone = move(move, stone);
                    if (isInRange(next_stone)) {
                        king = next_king;
                        stone = next_stone;
                    } else {
                        continue;
                    }
                }
                king = next_king;
            } else {
                continue;
            }
        }
        System.out.println(String.valueOf(king[0]) + String.valueOf(king[1]));
        System.out.println(String.valueOf(stone[0]) + String.valueOf(stone[1]));

    }

    public static boolean isInRange(char[] target) {
        if (target[0] < 'A' || target[0] > 'H' || target[1] < '1' || target[1] > '8') {
            return false;
        } else {
            return true;
        }
    }

    public static char[] move(String move, char[] target) {
        char[] result = target.clone();
        switch (move) {
            case "R":
                result[0]++;
                break;
            case "L":
                result[0]--;
                break;
            case "B":
                result[1]--;
                break;
            case "T":
                result[1]++;
                break;
            case "RT":
                result[0]++;
                result[1]++;
                break;
            case "LT":
                result[0]--;
                result[1]++;
                break;
            case "RB":
                result[0]++;
                result[1]--;
                break;
            case "LB":
                result[0]--;
                result[1]--;
                break;
        }
        return result;
    }
}
