package chapter10.codeblock;
//静态属性和方法优先调用，按照定义顺序依次完成；
//非静态属性和方法其次调用，按照定义顺序一次完成；
//构造器最后调用
public class CodeBlock02 {
    public static void main(String[] args) {
        A a = new A();

    }
}
class A{
    public A() {
        System.out.println("构造器被调用");
    }

    private int n2 = getN2();
    private static int n1=getN1();
    {
        System.out.println("A 普通代码块01");
    }
    static {
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1被调用...");
        return 100;
    }
    public  int getN2(){
        System.out.println("getN2被调用...");
        return 2100;
    }
}