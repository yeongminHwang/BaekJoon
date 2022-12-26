import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex_4673 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int i=1;
            while(i<=10000){
                if(checkSelfNum(i)){
                    bw.write(Integer.valueOf(i)+"\n");
                }
                i++;
            }

            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean checkSelfNum(int num) {
        if (num == 1) {
            return true;
        } else {
            for(int i=1; i<=num; i++){
                int count = 0;
                int i_num = i;
                while(i_num > 0){
                    count += i_num % 10;
                    i_num /= 10;
                }
                if(num == i + count){
                    return false;
                }
            }
            return true;
        }
    }
}
