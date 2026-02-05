import java.io.*;
import java.util.*;

public class Ex_35149 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] stage = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                stage[i][j] = line.charAt(j);
            }
        }

        int WALL = 0;
        int ALL_WAY_VIRUS = 0;
        int VACCINE = 0;
        int START = 0;
        int END = 0;
        int ONE_WAY_VIRUS = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                char board = stage[i][j];
                switch (board) {
                    case '#':
                        WALL++;
                        break;
                    case 'A':
                        ALL_WAY_VIRUS++;
                        break;
                    case 'U':
                    case 'D':
                    case 'L':
                    case 'R':
                        ONE_WAY_VIRUS++;
                        break;
                    case 'V':
                        VACCINE++;
                        break;
                    case 'S':
                        START++;
                        break;
                    case 'E':
                        END++;
                        break;
                    default:
                        break;
                }
            }
        }
        if (START != 1 | END != 1) {
            bw.write(String.valueOf(-1));
            bw.flush();
            return;
        }

        if (ALL_WAY_VIRUS < 1 && VACCINE < 1 && WALL <= 1 && ONE_WAY_VIRUS <= 1) {
            bw.write(String.valueOf(1));
            bw.flush();
            return;
        }

        if (WALL >= 0 && ONE_WAY_VIRUS >= 0 && ALL_WAY_VIRUS == 0 && VACCINE == 0) {
            bw.write(String.valueOf(2));
            bw.flush();
            return;
        }
        if (ALL_WAY_VIRUS == 0 && VACCINE >= 0) {
            bw.write(String.valueOf(3));
            bw.flush();
            return;
        }

        if (WALL >= 0 && ONE_WAY_VIRUS >= 0 && ALL_WAY_VIRUS >= 0 && VACCINE >= 0) {
            bw.write(String.valueOf(4));
            bw.flush();
            return;
        }
    }
}
