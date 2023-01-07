import java.util.Scanner;

public class Ex_25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int total_price = s.nextInt();
        int size = s.nextInt();

        int sum = 0;
        for (int i = 0; i < size; i++) {
            int price = s.nextInt();
            int count = s.nextInt();
            sum += price * count;
        }

        if (total_price == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
