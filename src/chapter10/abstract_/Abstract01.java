package chapter10.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //父类方法不确定性问题，将该方法设置为抽象方法.
    //当一个类中存在抽象方法时，需要将这个类设置为抽象类
    //抽象类是不能被实例化的
//    public void eat(){
//        System.out.println("不知道具体食材");
//    }
    public abstract void eat();
}
//抽象类不一定需要抽象方法
abstract class B{

}
