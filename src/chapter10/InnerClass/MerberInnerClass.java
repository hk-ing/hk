package chapter10.InnerClass;

public class MerberInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.f2();
        Outer01.Inner01 inner01 = outer01.new Inner01();
        inner01.say();
    }
}
class Outer01{
    private int n1 = 10;
    public String name = "hk";
    class Inner01{
        private int  n1  = 100;
        public void say(){
            System.out.println("n1="+n1+" name= "+name+Outer01.this.n1);
        }
    }
    public void f2(){
        Inner01 inner01 = new Inner01();
        inner01.say();
    }
}