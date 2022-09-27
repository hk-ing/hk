package chapter11.enum_;

/**
 * @author 韩坤
 * @version 1.0
 * 演示Enum类的各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season2枚举类来演示各种方法
        Season2 winter = Season2.WINTER;
        //输出枚举对象的名称
        System.out.println(winter.name());
        //输出枚举类对象的次序
        System.out.println(winter.ordinal());
        //返回枚举类的一个数组，包含了定义的所有枚举对象
        Season2[] values = Season2.values();
        for (Season2 season:values) {//增强for循环
            System.out.println(season);
        }
        //valueOf将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则回报错
        Season2 season2 = Season2.valueOf("WINTER");
        System.out.println(season2);
        //compareTo比较两个枚举常量的编号
        //返回的是season2的编号与winter编号的差值
        System.out.println(season2.compareTo(winter));
    }
}

