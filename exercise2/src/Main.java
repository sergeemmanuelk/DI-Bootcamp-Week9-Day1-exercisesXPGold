import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        rearrange(arr1);
        System.out.println(Arrays.toString(arr1)); // Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]

        int[] arr2 = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        rearrange(arr2);
        System.out.println(Arrays.toString(arr2)); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1 && arr[i] != i) {
                int x = arr[i];
                while (arr[x] != -1 && arr[x] != x) {
                    int y = arr[x];
                    arr[x] = x;
                    x = y;
                }
                arr[x] = x;
                if (arr[i] != i) {
                    arr[i] = -1;
                }
            }
        }
    }
}