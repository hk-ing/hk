package chapter10.InnerClass;

public class InnerClass01 {//外部其他类
    public static void main(String[] args) {

    }
}
class Outer{//外部类
    private int n1 =100;
    public void m1(){
        System.out.println("m1");

    }

    {
        System.out.println("代码块...");
    }
    class Inner{//内部类

    }
}