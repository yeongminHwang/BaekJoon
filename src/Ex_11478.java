import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ex_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        HashSet set = new HashSet();
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 0; j < input.length() - i + 1; j++) {
                String str = input.substring(j,j+i);
                if (!set.contains(str)) {
                    set.add(str);
                }
            }
        }

        System.out.println(set.size());
    }
}
