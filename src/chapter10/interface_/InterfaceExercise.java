package chapter10.interface_;

public class InterfaceExercise {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(B.a);
        System.out.println(AAA.a);
    }
}
interface AAA {
    int a = 23;
}
class B implements AAA {

}
