package chapter13.data_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 韩坤
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) {
        Date date = new Date();
        //默认输出的日期格式是国外的方式，因此通常需要对格式进行转换
        System.out.println("当前时间是："+date);

        //创建SimpleDateFormat对象，可以指定相应的格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
