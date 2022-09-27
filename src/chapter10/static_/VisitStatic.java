package chapter10.static_;

public class VisitStatic {
    public static void main(String[] args) {
        System.out.println(a.anInt);
        a b = new a();
        System.out.println(b.anInt);
    }
}
class a{
    public static int anInt=0;
}
