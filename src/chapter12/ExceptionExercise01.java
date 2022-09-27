package chapter12;

import java.util.Scanner;

/**
 * @author 韩坤
 * @version 1.0
 */
public class ExceptionExercise01 {
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数:");
//        int num = 0;
        do {
            try {
//                String n = scanner.next();
//                num = Integer.parseInt(n);
                Scanner scanner = new Scanner(System.in);
                int  n = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入一个整数:");
            }
        } while (true);


    }
}
