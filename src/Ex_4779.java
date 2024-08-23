import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex_4779 {
    static StringBuilder cantor_line;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n_str;
        while ((n_str = br.readLine()) != null) {
//            long beforeTime = System.currentTimeMillis();
            int n = Integer.parseInt(n_str);
            int total_line = (int) Math.pow(3, n);
            cantor_line = new StringBuilder();
            for (int i = 0; i < total_line; i++) {
                cantor_line.append("-");
            }

            cantor(0, total_line);
            bw.write(cantor_line.toString() + "\n");
            bw.flush();
//            long afterTime = System.currentTimeMillis();
//            long diffTime = afterTime - beforeTime;
//            System.out.println();
//            System.out.println("실행시간 : " + diffTime);
        }
    }

    public static void cantor(int start, int size) {
        if (size == 1) {
            return;
        }
        int newSize = size / 3;
        for (int i = start + newSize; i < start + (newSize * 2); i++) {
            cantor_line.setCharAt(i, ' ');
        }
        cantor(start, newSize);
        cantor(start + (newSize * 2), newSize);
    }
}
