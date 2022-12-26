import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex_7568 {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str_num = input.readLine();
        int num = Integer.parseInt(str_num);

        int[] rank_arr = new int[num];
        int[] height = new int[num];
        int[] weight = new int[num];
        for(int i=0; i<num; i++){
            String s = input.readLine();
            StringTokenizer st = new StringTokenizer(s);
            height[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<num; i++){
            int rank = 1;
            int tmp_height = height[i]; // 55
            int tmp_weight = weight[i]; // 185
            for(int j=0; j < num; j++){
                if(tmp_height < height[j] && tmp_weight < weight[j]){
                    rank++;
                }
            }
            rank_arr[i] = rank;
        }

        for(int i=0; i<num; i++){
            System.out.print(rank_arr[i]+" ");
        }
    }
}