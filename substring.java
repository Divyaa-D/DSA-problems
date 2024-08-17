import java.util.*;

public class substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                int[] hash = new int[128];
                String sub = str.substring(i, j);
                int ctr = 0;
                for (int k = 0; k < sub.length(); k++) {
                    char ch = sub.charAt(k);
                    if (hash[(int) ch] == 1) {
                        ctr = 1;
                        break;
                    } else
                        hash[(int) ch]++;

                }
                if (ctr == 0) {
                    max = Math.max(max, sub.length());
                }
            }
        }
        System.out.println("Max length is " + max);
    }

}
