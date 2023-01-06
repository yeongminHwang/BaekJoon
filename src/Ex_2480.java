import java.util.Scanner;

public class Ex_2480 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a == b && b == c && a == c) {
            System.out.println(10000 + (a * 1000));
        } else if (a != b && b != c && a != c) {
            int max = a;
            if (max < b) {
                max = b;
                if (b < c) {
                    max = c;
                }
            } else {
                if (max < c) {
                    max = c;
                }
            }
            System.out.println(max * 100);
        } else {
            if (a == b) {
                System.out.println(1000 + (a * 100));
            } else if (b == c) {
                System.out.println(1000 + (b * 100));
            }  else {
                System.out.println(1000 + (a * 100));
            }
        }
    }
}
