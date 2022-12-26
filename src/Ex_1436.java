import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int num = Integer.parseInt(st.nextToken());

        int index = 666;
        int count = 0;
        int title = 0;
        while (num != count) {
            String str_num = String.valueOf(index);
            char[] str_arr = str_num.toCharArray();
            for (int i = 0; i < str_arr.length-2; i++) {
                if(str_arr[i]=='6' && str_arr[i+1]=='6'&&str_arr[i+2]=='6'){
                    count++;
                    title = index;
                    break;
                }
            }
            index++;
        }
        System.out.println(title);
    }
}