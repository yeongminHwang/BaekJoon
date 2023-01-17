import java.io.*;
import java.util.StringTokenizer;

public class Ex_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        br.close();
        if (m > n / 2) {
            m = n - m;
        }

        int five_count = getFivePow(n) - getFivePow(m) - getFivePow(n - m);
        int two_count = getTwoPow(n) - getTwoPow(m) - getTwoPow(n - m);

        int result = five_count > two_count ? two_count : five_count;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

    static int getFivePow(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n = n / 5;
        }
        return count;
    }

    static int getTwoPow(int n) {
        int count = 0;
        while (n >= 2) {
            count += n / 2;
            n = n / 2;
        }
        return count;
    }
}
