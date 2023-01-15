import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Ex_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int set_A_size = Integer.parseInt(st.nextToken());
        int set_B_size = Integer.parseInt(st.nextToken());

        HashSet setA = new HashSet();
        HashSet setB = new HashSet();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < set_A_size; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < set_B_size; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        HashSet copy = (HashSet) setA.clone();
        copy.removeAll(setB);
        result += copy.size();

        setB.removeAll(setA);
        result += setB.size();

        System.out.println(result);


    }
}
