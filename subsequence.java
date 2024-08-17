import java.util.*;

public class subsequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {

                if (i == str1.length() - 1) {
                    System.out.println("True");
                    return;
                }
                i++;
                j++;
            } else {
                j++;
            }
        }
        System.out.println("False");
    }

}
