package chapter13.system_;

import java.util.Arrays;

/**
 * @author 韩坤
 * @version 1.0
 */
public class System01 {
    public static void main(String[] args) {
        //exit(0) 退出当前程序
        //0表示一个正常的退出状态
//        System.out.println("ok1");
//        System.exit(0);
//        System.out.println("ok2");
        //arraycopy复制数组元素
        int src[] = {1,2,3};
        int[] dest= new int[3];
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
        System.out.println(System.currentTimeMillis());
    }
}
