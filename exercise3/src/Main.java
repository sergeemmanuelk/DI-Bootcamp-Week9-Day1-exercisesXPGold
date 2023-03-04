public class Main {
    public static void main(String[] args) {

        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println("The array is rotated " + findRotationCount(arr) + " times to the right.");
    }

    public static int findRotationCount(int[] arr) {
        int min = arr[0];
        int min_index = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }
}