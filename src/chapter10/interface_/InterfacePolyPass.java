package chapter10.interface_;
/*
 *演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {
        IB ib = new Teach();//接口类型的变量可以指向实现了该接口的类的对象实例
        IA ia = new Teach();//多态传递
    }
}
interface IA{ }
interface IB extends IA{ }
class Teach implements IB{

}