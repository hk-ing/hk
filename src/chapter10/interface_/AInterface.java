package chapter10.interface_;

public interface AInterface {
    //写属性
    public int n1 = 10;
    public void hi();
    public static void ok(){
        System.out.println("ok");
    }
}
class A implements AInterface{
    @Override
    public void hi() {
        System.out.println("hi...");
    }
}