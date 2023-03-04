import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[right--];
            else
                temp[i] = arr[left++];
            flag = !flag;
        }
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }
}