import java.io.*;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Ex_16139 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int q = Integer.parseInt(br.readLine());

        int[][] arr = new int[26][input.length() + 1];
        for (int i = 0; i < arr.length; i++) {
            // A = 0, B = 1 ,C = 2...
            arr[i][0] = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if ((int) input.charAt(j - 1) == (i + 'a')) {
                    arr[i][j] += arr[i][j - 1] + 1;
                } else {
                    arr[i][j] = arr[i][j - 1];
                }
            }
        }
//        print 코드
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(Character.toString(i + 'a') + " ");
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        StringTokenizer st;
        while (q-- > 0) {
            st = new StringTokenizer(br.readLine());

            int alpha = st.nextToken().charAt(0) - 'a';
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(arr[alpha][r + 1] - arr[alpha][l]));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
