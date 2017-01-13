package Common;

import java.util.Scanner;

/**
 * Created by leixun on 16/9/12.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            if (n < 1 || n > 30) {
                return;
            }
            long sum = 1;
            for (int i = 1; i <= n; i++) {
                sum = sum * 3;
            }
            if (n == 2) {
                System.out.println(9);
            } else if (n == 3) {
                System.out.println(21);
            } else {
                long cunjing = 1;
                for (int k = 1; k <= n - 3; k++) {
                    cunjing = cunjing * 3;
                }
                cunjing = cunjing * (n - 2);
                long anhei = sum - cunjing;
                System.out.println(anhei);
            }
        }
    }
}
