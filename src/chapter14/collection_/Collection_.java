package chapter14.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 韩坤
 * @version 1.0
 */
public class Collection_ {
    public static void main (String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add(10);
        arrayList.add(true);
        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        arrayList.remove(true);
        System.out.println(arrayList);
        arrayList.add(0);
        System.out.println(arrayList);
        arrayList.remove("10");
        System.out.println(arrayList);
        //contains:查找元素是否存在返回Boolean类型;
        System.out.println(arrayList.contains(10));
        //size:获取元素个数
        System.out.println(arrayList.size());
        //isEmpty:判断是否为空
        System.out.println(arrayList.isEmpty());
        //clear:清空
        arrayList.clear();
        System.out.println(arrayList);
        //addAll:添加多个元素
    }
}
