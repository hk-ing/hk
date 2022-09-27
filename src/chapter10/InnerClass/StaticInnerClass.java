package chapter10.InnerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer06 outer06 = new Outer06();
        outer06.m1();
        Outer06.Inner02 inner02 = new Outer06.Inner02();
        inner02.say();

    }
}

class Outer06 {
    static private int n1 = 10;
    static private String name = "hk";

    static class Inner02 {
        private int n1 = 100;

        public void say() {
            System.out.println("n1=" + n1 + " name= " + name);
        }
    }
    public void m1(){
        Inner02 inner02 = new Inner02();
        inner02.say();
    }
}