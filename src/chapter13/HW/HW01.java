package chapter13.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW01 {
    public static void main(String[] args) {
        String str = new String("abcde");
        System.out.println(str);
        System.out.println(reverse(str,1,3));
    }
    public static String reverse(String str,int start,int end){
        if (start >= 0 && end< str.length() &&str!=null) {
            char temp = ' ';
            char[] chars = str.toCharArray();
            for (int i = start , j = end; i <=(end+start)/2 ; i++ , j--) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            return new String(chars);
        }
        else
            return "输入有误";
    }
}
