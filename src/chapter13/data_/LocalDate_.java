package chapter13.data_;

import java.time.LocalDateTime;

/**
  * @author  韩坤
  * @version 1.0
 */public class LocalDate_ {
    public static void main(String[] args) {
        //第三代日期
        //使用now()返回表示当前时间的对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println("年："+now.getYear());
    }
}
