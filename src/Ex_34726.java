import java.io.*;
import java.util.StringTokenizer;

public class Ex_34726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N_T = br.readLine();
        StringTokenizer st = new StringTokenizer(N_T);
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
    }

    public static boolean canDRS(int distance) {
        return distance > 0 && distance <= 1000;
    }
}
