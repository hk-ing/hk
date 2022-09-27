package chapter13.arrays_;

import java.util.Arrays;

/**
 * @author 韩坤
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,4,30};
        //binarySearch 通过二分搜索法进行查找，要求数组必须已完成排序
        //如果数组中不存在该元素，则return -（low+1）
       int index = Arrays.binarySearch(arr,2);
        System.out.println(index);

        //copyOf数组元素的复制,从arr数组中拷贝arr.length个元素到newArr中;
        //如果拷贝长度>arr.length，则填充null，如果长度是负数则报错
        Integer newArr[] = Arrays.copyOf(arr,arr.length);
        Integer newArr2[] = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(newArr2));

        //fill(arr[],int)数组元素的填充
        Integer num[] = {1,2,3};
        Arrays.fill(num,68);
        System.out.println(Arrays.toString(num));

        //equals比较两个数组元素是否完全相同
        System.out.println(Arrays.equals(num,arr));
    }
}
