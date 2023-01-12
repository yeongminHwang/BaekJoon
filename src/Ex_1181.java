import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Ex_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());

        String[] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        br.close();

        Arrays.sort(arr, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.length() == o2.length()) {
                            return o1.compareTo(o2);
                        } else {
                            return o1.length() - o2.length();
                        }
                    }
                }
        );

        sb.append(arr[0]).append("\n");
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
