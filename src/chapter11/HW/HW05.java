package chapter11.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}
class A{
    private int a=9;
    public void f1(){
        class B{
            private final int a =8;
            public void show(){
                System.out.println(a+" " +A.this.a);
            }
        }
        B b = new B();
        b.show();
    }

}