package chapter12;

/**
 * @author 韩坤
 * @version 1.0
 */
public class EXCEPTION04 {
    public static void main(String[] args) {
        A b = new B();//向上转型
        B b2 = (B)b;
        try {
            C c2 = (C) b;//ClassCastException
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序还能够运行吗");
    }
}
class A{}
class B extends A{}
class C extends A{}