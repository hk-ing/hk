package chapter10.final_;

/*
final修饰符在修饰变量时必须进行赋值：
1.可以在定义的时候赋值；
2.可以在构造器中赋值；
3.可以在代码块中赋值.
a。如果final修饰的属性是静态的，则初始化的位置只能是1和2
b。final修饰的类不能被继承
c。final修饰的函数不能被重写但是可以继承使用
 */
public class Final01 {
    public static void main(String[] args) {
        System.out.println(BB.num);
    }
}

class AA {
    public final double TAX_RATE1 = 1.0;
    public final double TAX_RATE2;
    public final double TAX_RATE3;

    {
        TAX_RATE2 = 12;
    }

    public AA() {
        TAX_RATE3 = 14;
    }
}
class BB{
    public final static int num =10000;
    static {
        System.out.println("BB的静态代码块被执行");
    }
}