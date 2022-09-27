package chapter13.wrapper;

/**
 * @author 韩坤
 * @version 1.0
 */
public class WrapperType {
    public static void main(String[] args) {
       // Boolean Character
        int i = 100;
        Integer n = i;
        String s = n.toString();
        Integer integer = Integer.valueOf(s);
    }
}
