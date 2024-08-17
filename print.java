// tennis court probelm

import java.util.*;

class Main {
    public static void main(String[] args) {
        int b1x = 0, b1y = 0;
        int b2x = 40, b2y = 0;
        int b3x = 5, b3y = 60;
        int b4x = 35, b4y = 60;
        int b5x = 5, b5y = -60;
        int b6x = 35, b6y = -60;

        for (int i = b3x; i <= b4x - 6; i++) {
            if (i == b3x)
                System.out.print("(5,60)");
            System.out.print("_");
        }
        System.out.println("(35,60)");
        for (int i = b3x; i >= 0; i--) {
            for (int j = b3x; j <= b4x; j++) {
                if (j == b4x || j == b3x) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            if (i == 0)
                System.out.print("(40,0)");
            System.out.println();
        }
        System.out.println("(0,0)");
        for (int i = b3x; i >= 0; i--) {
            for (int j = b3x; j <= b4x; j++) {
                if (j == b4x || j == b3x) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = b3x; i <= b4x - 8; i++) {

            if (i == b3x)
                System.out.print("(5,-60)");
            System.out.print("_");
            if (i == b4x - 8)
                System.out.print("(35, -60)");
        }
        System.out.println();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-cordinate of ball:");
        int bx = sc.nextInt();
        System.out.println("Enter the y-cordinate of ball:");
        int by = sc.nextInt();
        int[] dis = new int[6];
        dis[0] = (int) Math.sqrt((bx - b1x) * (bx - b1x) + (by - b1y) * (by - b1y));
        dis[1] = (int) Math.sqrt((bx - b2x) * (bx - b2x) + (by - b2y) * (by - b2y));
        dis[2] = (int) Math.sqrt((bx - b3x) * (bx - b3x) + (by - b3y) * (by - b3y));
        dis[3] = (int) Math.sqrt((bx - b4x) * (bx - b4x) + (by - b4y) * (by - b4y));
        dis[4] = (int) Math.sqrt((bx - b5x) * (bx - b5x) + (by - b5y) * (by - b5y));
        dis[5] = (int) Math.sqrt((bx - b6x) * (bx - b6x) + (by - b6y) * (by - b6y));
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < dis.length; i++) {
            if (dis[i] < min) {
                min = dis[i];
                ans = i;
            }
        }
        System.out.println("The Ballkid " + (ans + 1) + " will pick the ball");
    }
}