public class prac {
    public static void main(String[] args) {
        char c[] = { 'h', 'e', 'l', 'l', 'o' };
        String str = new String(c, 1, 3);
        System.out.println(str);
        byte b[] = { 65, 66, 67, 68, 69 };
        String str2 = new String(b, 1, 3);
        System.out.println(str2);
    }
}
