import java.io.*;

public class Ex_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = false;
        int num = 0;
        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            char c = str.charAt(0);
            if (c != 'F' && c != 'B') {
                num = Integer.parseInt(str);
                flag = true;
            }

            if (flag) {
                num++;
            }
        }

        System.out.println(getFizzBuzz(num));
    }

    static String getFizzBuzz(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}
