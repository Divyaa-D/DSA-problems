import java.util.*;

public class heapsort {
    public static void insert_heap(int[] arr, int n) {
        int temp = arr[n];
        int i = n;
        while (i > 1 && arr[i / 2] < temp) {
            arr[i] = arr[i / 2];
            i = i / 2;
        }
        arr[i] = temp;
    }

    public static void delete_heap(int[] arr, int n) {
        int temp = arr[1];
        arr[1] = arr[n];
        arr[n] = temp;
        int i = 1;
        int j = 2 * i;
        while (j <= n - 1) {
            if (arr[j + 1] > arr[j] && j < n - 1)
                j = j + 1;
            if (arr[j] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = j;
                j = 2 * i;
            } else
                break;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 2; i <= n; i++) {
            insert_heap(arr, i);
        }
        for (int i = n; i >= 1; i--) {
            delete_heap(arr, i);
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
