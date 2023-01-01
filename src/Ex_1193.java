import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int level = x;
        int i = 0;
        while (level > 0) {
            level -= ++i;
        }

        int pos = level;
        level = i;

        if (level % 2 == 0) { // 대각선 아래로 내려가는 방향
            System.out.println(level + pos + "/" + (level - (level + pos) + 1));
        } else { // 대각선 위로 올라가는 방향
            System.out.println((level - (level + pos) + 1) + "/" + (level + pos));
        }
    }
}
