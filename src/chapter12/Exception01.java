package chapter12;

/**
 * @author 韩坤
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int n1 = 10 ;
        int n2 = 0;
        //将有异常的代码块选中，ctrl+alt+t选择6选项，程序则可以忽略异常继续执行下去
        try {
            int res = n1 / n2;//ArithmeticException
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序还能继续运行");
    }
}
