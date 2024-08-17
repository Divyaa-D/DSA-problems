import java.util.*;

public class zoho {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] presum = new int[n];
        presum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            presum[i] = presum[i - 1] + arr[i];
        }
        int ctr = 0;
        for (int i = 1; i < n - 1; i++) {
            if (presum[i - 1] == presum[n - 1] - presum[i]) {
                System.out.println("True");
                ctr = 1;
                break;
            }
        }
        if (ctr == 0)
            System.out.println("False");
    }
}
