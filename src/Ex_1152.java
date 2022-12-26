import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex_1152 {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            String line = bf.readLine();
            int count = 0;
            int length = line.length();
            if (length != 0) {
                for (int i = 0; i < length - 1; i++) {
                    if (line.charAt(i) != ' ' && line.charAt(i + 1) == ' ') {
                        count++;
                    }
                }
                if (line.charAt(length - 1) != ' ') {
                    count++;
                }
            }
            bw.write(String.valueOf(count));
            bf.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
