package chapter13.math;

import java.util.Arrays;

/**
 * @author 韩坤
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        System.out.println(Math.min(2,2.3));
        Integer []integers = {1,2,3,4,5};
        System.out.println(Arrays.toString(integers));
        //sort方法的使用
        Integer []arr = {1,3,2,4,6,5};
        Arrays.sort(arr);//默认排序方法
        System.out.println(Arrays.toString(arr));
    }
}
