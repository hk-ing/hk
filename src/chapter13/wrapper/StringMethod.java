package chapter13.wrapper;

/**
 * @author 韩坤
 * @version 1.0
 */
public class StringMethod {
    public static void main(String[] args) {
//        String s1 = "hello";
//        String s2 = "Hello";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//        System.out.println(s1.length());
//        int index = s1.indexOf('e');
//        System.out.println(index);
//        index = s1.lastIndexOf('l');
//        System.out.println(index);
//        String name = "截取指定范围字符";
//        System.out.println(name.substring(6));
//        System.out.println(name.substring(0,3));//左闭右开[0,3)，右边最后一个字符取不到
        String poem = "登高才见无量山，青天何处仰面观，看破多少不堪事，人间地狱总一般";
        String[] split = poem.split("，");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        String s3 = "happy";
        char[] chars = s3.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
