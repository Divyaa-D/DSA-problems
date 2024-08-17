import java.util.*;

public class quick {
    public static void quicksort(int[] arr, int start, int end) {

        if (start < end) {
            int pivot = arr[start];
            int k = end;
            for (int i = end; i > start; i--) {
                if (arr[i] > pivot) {
                    int temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                    k--;
                }
            }
            int temp = arr[k];
            arr[k] = pivot;
            arr[start] = temp;
            quicksort(arr, start, k - 1);
            quicksort(arr, k + 1, end);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 4 8 1 3 2

// 4 2 1 3 8
// 3 2 1 4 8