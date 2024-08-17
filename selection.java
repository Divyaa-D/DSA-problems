import java.util.*;

public class selection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int j = i, k = i;
            while (j < n) {
                if (arr[j] < arr[k])
                    k = j;
                j++;
            }
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
