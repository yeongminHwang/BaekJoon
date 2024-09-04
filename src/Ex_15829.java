import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Ex_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //해시함수 항의 계수가 31^49까지 가능하므로 Long 타입으로 들어가야함.
        int L = Integer.parseInt(st.nextToken());
        BigInteger hash = BigInteger.ZERO;

        String input = br.readLine(); // 해시 input
        for (int i = 0; i < L; i++) {
            hash = hash.add(BigInteger.valueOf(input.charAt(i) - '`').multiply(BigInteger.valueOf(31).pow(i)));
        }
        hash = hash.remainder(BigInteger.valueOf(1234567891));
        bw.write(hash.toString());
        bw.flush();
    }
}
