package chapter10.single_;
/*
演示懒汉式单例模式：

 */
public class SingleTon02 {
    public static void main(String[] args) {
        System.out.println(Cat.getInstance());
    }
}
class Cat{
    private  String name;
    private static Cat cat;
    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance(){
        if (cat == null) {
            cat = new Cat("花花");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}