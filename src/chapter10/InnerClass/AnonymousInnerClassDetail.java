package chapter10.InnerClass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.f1();
    }
}

class Outer04{
    private int n1 = 99;
    public void f1(){
        //创建一个基于类的匿名内部类
       Person p = new Person() {
           @Override
           public void hi() {
               System.out.println("匿名内部类");
           }
       };
       p.hi();
    }
}
class  Person {
    public void hi(){
        System.out.println("hi");
    }
}