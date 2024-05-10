import java.util.Arrays;

public class CycleSort {
    public static void sortedArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - 1;
            if (arr[i] != arr[idx]) { // or (arr[i] != i+1)
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 4 };
        sortedArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
