import java.io.*;
import java.util.*;

public class Ex_17363 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] arr = new char[M][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                char origin_char = line.charAt((M - j) - 1);
                char converted_char = convert(origin_char);
                arr[j][i] = converted_char;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();
    }
    public static char convert(char origin_char) {
        switch (origin_char) {
            case '.' :
                return '.';
            case 'O' :
                return 'O';
            case '-' :
                return '|';
            case  '|':
                return '-';
            case '/' :
                return '\\';
            case '\\':
                return '/';
            case '^' :
                return '<';
            case '<' :
                return 'v';
            case 'v' :
                return '>';
            case '>':
                return '^';
            default:
                return origin_char;
        }
    }
}
