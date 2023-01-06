import java.util.Scanner;

public class Ex_10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int size = s.nextInt();


        for (int i = 0; i < size; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            sb.append(String.valueOf(a + b) + "\n");
        }
        System.out.println(sb.toString());
    }
}
