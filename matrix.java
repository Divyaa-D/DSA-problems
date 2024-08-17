import java.util.*;

public class matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < r; i++) {
            if (i + (x - 1) < r) {
                for (int j = 0; j < c; j++) {
                    if (j + (y - 1) < c) {
                        int sum = 0;
                        int sr = i, sc = i + (x - 1);
                        int dr = j, dc = j + (y - 1);
                        for (int k = sr; k <= dr; k++) {
                            for (int h = sc; h < dc; h++) {
                                sum += mat[k][h];
                            }
                        }
                        System.out.print(sum + " ");
                    }
                }
            }
        }
        sc.close();
    }
}
