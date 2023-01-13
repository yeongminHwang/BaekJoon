import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine());

        StringBuilder[] sb_list = new StringBuilder[201];
        for (int i = 0; i < sb_list.length; i++) {
            sb_list[i] = new StringBuilder();
        }

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            sb_list[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder sb = new StringBuilder();
        for (StringBuilder val : sb_list) {
            sb.append(val);
        }

        System.out.println(sb);

    }
}

