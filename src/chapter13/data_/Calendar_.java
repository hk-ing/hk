package chapter13.data_;

import java.util.Calendar;

/**
 * @author 韩坤
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        //Calendar是一个抽象类，并且构造器是私有化的
        //可以通过getInstance()来获取实例;
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        //获取日历对象的某些日历字段
        System.out.println("年："+instance.get(Calendar.YEAR));
        System.out.println("月："+(instance.get(Calendar.MONTH)+1));//月份默认从零开始编号所以需要加一
        System.out.println("日："+instance.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时："+instance.get(Calendar.HOUR));
        System.out.println("分钟："+instance.get(Calendar.MINUTE));
        System.out.println("秒："+instance.get(Calendar.SECOND));
    }
}
