import java.util.*;

public class recursive_merge {
    public static void merge(int[] arr, int l, int mid, int h) {
        int[] B = new int[h - l + 1];
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= h) {
            if (arr[i] < arr[j])
                B[k++] = arr[i++];
            else
                B[k++] = arr[j++];
        }
        for (; i <= mid; i++) {
            B[k++] = arr[i];
        }
        for (; j <= h; j++) {
            B[k++] = arr[j];
        }
        k = 0;
        for (int p = l; p <= h; p++)
            arr[p] = B[k++];
    }

    public static void mergesort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = (l + h) / 2;
            mergesort(arr, l, mid);
            mergesort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergesort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
