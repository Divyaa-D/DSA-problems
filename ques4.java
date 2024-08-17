//couple holding hands - leetcode

import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] pos = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            pos[arr[i]] = i;
        }
        // for (int j = 0; j < n; j++) {
        // System.out.print(pos[j] + " ");
        // }
        System.out.println();
        int cnt = 0;
        int pair = 0;
        for (int i = 1; i < n; i += 2) {
            if (arr[i - 1] % 2 == 0) {
                pair = arr[i - 1] + 1;
            } else if (arr[i - 1] % 2 == 1) {
                pair = arr[i - 1] - 1;
            }
            int p = pos[pair];
            if (arr[i] != pair) {
                cnt++;
                int temp = arr[p];
                arr[p] = arr[i];
                pos[arr[i]] = p;
                arr[i] = temp;
                pos[temp] = i;
                // temp = pos[p];
                // pos[p] = pos[i];
                // pos[i] = temp;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        // for (int j = 0; j < n; j++) {
        // System.out.print(arr[j] + " ");
        // }
        System.out.println();
        System.out.println(cnt);
    }
}
