package chapter10.single_;

//饿汉式单例模式:
//1.将构造器私有化;
//2.在类的内部直接创建静态对象；
//3.提供一个公共的static方法，返回创建的对象
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.getInstance();
        System.out.println(girlFriend);
    }
}
class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("刘娜");
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}