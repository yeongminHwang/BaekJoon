import java.util.*;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String a = "abc";

        for(int i=0; i<1000000000; i++) {
            sb.append(a);
        }
        System.out.println(sb.toString());
        System.out.println(sb.toString().intern());

        StringBuffer sf = new StringBuffer();

    }
}
