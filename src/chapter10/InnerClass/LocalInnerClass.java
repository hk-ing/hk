package chapter10.InnerClass;

//演示局部内部类的使用
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 out = new Outer02();
        out.m1();

    }
}
class Outer02{
    private int n1 = 100;
    private void m2(){
        System.out.println("m2方法被调用...");
    }
    public void m1(){
        //局部内部类是定义在外部类的局部位置，通常在方法中
        class Inner02{//可以访问外部类的所有成员
            public void f1(){
                System.out.println("n1="+n1);
                m2();
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}