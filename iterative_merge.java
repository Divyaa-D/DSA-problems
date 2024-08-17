import java.util.*;

public class iterative_merge {
    public static void merge(int[] arr, int low, int mid, int end) {
        // int mid = (low + end) / 2;
        int i = low, j = mid + 1;
        int k = 0;
        int[] B = new int[end - low + 1];
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                B[k++] = arr[i++];
            else
                B[k++] = arr[j++];
        }
        for (; i <= mid; i++)
            B[k++] = arr[i++];
        for (; j <= end; j++)
            B[k++] = arr[j++];
        k = 0;
        for (int p = low; p <= end; p++)
            arr[p] = B[k++];

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = 0;
        for (p = 2; p < n; p *= 2) {
            for (int i = 0; i + p - 1 < n; i += p) {
                int l = i;
                int h = i + p - 1;
                int mid = (l + h) / 2;
                merge(arr, l, mid, h);
            }
        }
        if (p / 2 < n)
            merge(arr, 0, p / 2 - 1, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
