package chapter13.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW03 {
    public static void main(String[] args) {
        String str = "Han Shun Ping";
        System.out.println(split(str));
    }
    public static String split(String str){
        String[] s = str.split(" ");
        char ch[] = s[1].toCharArray();
        return s[2]+","+s[0]+"."+ch[0];
    }
}
