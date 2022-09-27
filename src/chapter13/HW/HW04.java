package chapter13.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW04 {
    public static void main(String[] args) {
        String str = "qweQWER";
        num(str);
    }
    public static void num(String str){
        int count1 = 0;
        int count2 = 0;
        char ch[]=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if('a'<ch[i]&&ch[i]<'z')
                count1++;
            else
                count2++;
        }
        System.out.println("小写字母有"+count1+"个");
        System.out.println("大写字母有"+count2+"个");
    }
}
