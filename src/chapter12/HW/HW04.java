package chapter12.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW04 {
    public static void main(String[] args) {
        try {
            showExer();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");;
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void showExer()throws Exception{
        throw new Exception();
    }
}

