import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ex_2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int size = Integer.parseInt(input);

        int[] arr = new int[size];

        ArrayList list = new ArrayList();

        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (Object value : list) {
           sb.append((int)value).append('\n');
        }
        System.out.println(sb);
    }
}
