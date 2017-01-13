package Common;

/**
 * Created by leixun on 16/9/12.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Main Instance = new Main();
        while (in.hasNextInt()) {//注意while处理多个case
            int x = in.nextInt();
            int y = in.nextInt();
            if (x < 1 || x > 1000 || y < 1 || y > 1000) {
                return;
            }
            int rev_x = Instance.Rev(x);
            int rev_y = Instance.Rev(y);
            int rev_s = Instance.Rev(rev_x + rev_y);
            System.out.println(rev_s);
        }
    }

    private int Rev(int number) {
        String string = String.valueOf(number);
        StringBuffer stringBuffer = new StringBuffer(string);
        stringBuffer = stringBuffer.reverse();
        string = String.valueOf(stringBuffer);
        char[] chars = string.toCharArray();
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0'){
                index = i;
                break;
            }
        }
        if (index != 0){
            string = string.substring(index);
        }
        int result = Integer.parseInt(string);
        return result;
    }
}

