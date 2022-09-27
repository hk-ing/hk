package chapter13.stringBuffer;

import java.util.Scanner;

/**
 * @author 韩坤
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        System.out.println("商品名称\t商品价格");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String[] split = s2.split("\\.");
        StringBuffer stringBuffer = new StringBuffer(split[0]);
        System.out.println(stringBuffer);
        if (stringBuffer.length()<=3){
           System.out.println(s1+"\t"+s2);
       }else {
           for (int i = stringBuffer.length(); i >3 ; i-=3) {
               stringBuffer = stringBuffer.insert(i-3, ",");
           }
            System.out.println(s1+"\t"+stringBuffer.append(".").append(split[1]));
       }
   }
}
