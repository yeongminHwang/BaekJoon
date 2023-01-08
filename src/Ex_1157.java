import java.io.*;

public class Ex_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a') {
                ch = (char) (ch - 32);
            }
            arr[ch - 'A']++;
        }

        int max = 0;
        int max_index = 0;
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                max_index = i;
                result = String.valueOf((char) ((int) 'A' + max_index));
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (max_index != i && max == arr[i]) {
                result = "?";
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
