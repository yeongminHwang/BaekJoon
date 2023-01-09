import java.io.*;

public class Ex_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < size; i++) {
            String input = br.readLine();
            if (isGroupWord(input)) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static boolean isGroupWord(String word) {
        boolean is_GroupWord = true;
        for (int i = 0; i < word.length(); i++) {
            int index = -1;
            for (int j = i; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    if (index != -1) {
                        is_GroupWord = false;
                        break;
                    }
                    continue;
                } else {
                    index = j;
                }
            }
        }
        return is_GroupWord;
    }
}
