import java.util.*;

public class cyware {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ctr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                ctr++;
            if (arr[i] <= x)
                max = Math.max(max, arr[i]);
        }
        if (ctr == 0)
            System.out.print("Floor of x is -1");
        else
            System.out.println("Floor of x is " + max);
    }

}
