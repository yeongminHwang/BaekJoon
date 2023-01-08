import java.io.*;
import java.util.HashMap;

public class Ex_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] c_table = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // d dz= z=
        int c_table_count = 0;
        for (int i = 0; i < c_table.length; i++) {
            int count = 0;
            while (input.indexOf(c_table[i]) >= 0) {
                input = input.replaceFirst(c_table[i], " ");
                count++;
            }
            c_table_count += count;
        }
        input = input.replaceAll(" ", "");

        bw.write(String.valueOf(c_table_count + input.length()));
        bw.flush();
        bw.close();
    }
}
