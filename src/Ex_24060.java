import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex_24060 {
    static int[] sorted_arr;
    static int count = 0;
    static int K = 0;
    static int store_num = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        sorted_arr = new int[arr.length];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr, 0, arr.length - 1);
        if (count > K) {
            System.out.println(store_num);
        } else {
            System.out.println(-1);
        }
    }

    public static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            merge_sort(arr, left, mid);
            merge_sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                sorted_arr[idx] = arr[l];
                l++;
            } else {
                sorted_arr[idx] = arr[r];
                r++;

            }
            idx++;
            count++;
            if (count == K) {
                store_num = sorted_arr[idx - 1];
            }
        }

        if (l > mid) {
            while (r <= right) {
                sorted_arr[idx] = arr[r];
                r++;
                idx++;
                count++;
            }
            if (count == K) {
                store_num = sorted_arr[idx - 1];
            }
        } else {
            while (l <= mid) {
                sorted_arr[idx] = arr[l];
                l++;
                idx++;
                count++;
            }
            if (count == K) {
                store_num = sorted_arr[idx - 1];
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sorted_arr[i];
        }
    }
}
