import java.io.*;

public class Ex_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(br.readLine());

        int[] counting_arr = new int[10001];
        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            counting_arr[num]++;
        }
        br.close();

        for (int i = 0; i < counting_arr.length; i++) {
            if (counting_arr[i] != 0) {
                for (int j = 0; j < counting_arr[i]; j++) {
                    sb.append(String.valueOf(i)).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
