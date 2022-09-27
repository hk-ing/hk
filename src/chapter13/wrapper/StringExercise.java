package chapter13.wrapper;

/**
 * @author 韩坤
 * @version 1.0
 */
public class StringExercise {
    public static void main(String[] args) {
        String a = "abc";//创建a对象
        String b ="hello";//创建b对象
        String s = a+b;
        String d = "abchello";
        System.out.println(d==s);
    }
}
