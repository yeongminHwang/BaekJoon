import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] copy = new Integer[N];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = arr[i];
        }

        Arrays.sort(copy);

        HashMap map = new HashMap();
        int index = 0;
        for (int i = 0; i < copy.length; i++) {
            if (!map.containsKey(copy[i])) {
                map.put(copy[i], index);
                index++;
            }
        }

        for (int val : arr) {
            sb.append(map.get(val)).append(' ');
        }

        System.out.println(sb);
    }
}
