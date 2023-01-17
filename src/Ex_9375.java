import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Ex_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc_size = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc_size; i++) {
            int category_num = Integer.parseInt(br.readLine());
            HashMap<String, Integer> category_map = new HashMap<String, Integer>();

            for (int j = 0; j < category_num; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String category = st.nextToken();
                if (!category_map.containsKey(category)) {
                    category_map.put(category, 2);
                } else {
                    Integer category_value = (Integer) category_map.get(category);
                    category_map.replace(category, category_value + 1);
                }
            }

            int result = 1;
            Iterator iterator = category_map.keySet().iterator();
            while (iterator.hasNext()) {
                result *= category_map.get(iterator.next());
            }
            sb.append(String.valueOf(result - 1)).append("\n");

        }
        System.out.println(sb);
    }

}
