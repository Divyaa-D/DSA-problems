import java.util.*;

public class ques2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1");
        String s1 = sc.next();
        System.out.println("Enter String2");
        String s2 = sc.next();
        int[] hash = new int[128];
        if (s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }
        int[] hash2 = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (hash2[(int) ch2] == 0 || hash2[(int) ch2] == (int) ch1)
                hash2[(int) ch2] = (int) ch1;
            else {
                System.out.println("False");
                return;
            }
            if (hash[(int) ch1] == 0 || hash[(int) ch1] == (int) ch2)
                hash[(int) ch1] = (int) ch2;
            else {
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
