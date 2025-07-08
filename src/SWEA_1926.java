import java.util.Scanner;

public class SWEA_1926 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            String N = String.valueOf(i);
//            System.out.println(N);
            for (int j = 0; j < N.length(); j++) {
                if ((N.charAt(j) - '0') % 3 == 0) {
                    System.out.print('-');
                } else {
                    System.out.print(N.charAt(j));
                }
            }
            System.out.print(' ');
        }
    }
}

class SMEA_1957 {
    public void function() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            String N = String.valueOf(i);
            System.out.println(N);
            for (int j = 0; j < N.length(); j++) {
                if ((N.charAt(j) - '0') % 3 == 0) {
                    System.out.println('-');
                } else {
                    System.out.println(N.charAt(j));
                }
            }
        }
        System.out.println('-');
    }
}