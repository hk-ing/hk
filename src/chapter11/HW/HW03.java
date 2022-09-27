package chapter11.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.shout();
        Animal dog = new Dog();
        dog.shout();
    }
}
abstract class Animal{
    public abstract void shout();
}
class Cat extends Animal{

    @Override
    public void shout() {
        System.out.println("猫喵喵叫...");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {

    }
}