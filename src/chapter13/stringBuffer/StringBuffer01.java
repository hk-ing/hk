package chapter13.stringBuffer;

/**
 * @author 韩坤
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer SB = new StringBuffer("hello");
        System.out.println(SB);
        //String 转成StringBuffer
        //方法1：
        String s1 = "hello";
        StringBuffer stringBuffer1 = new StringBuffer(s1);
        //方法2：
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer = stringBuffer.append(s1);

        //StringBuffer转成String
        //方法1：
        String s = SB.toString();
        //方法2：
        String s2 = new String(SB);
    }
}
