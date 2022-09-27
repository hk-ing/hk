package chapter10.static_;

public class ChildGame {
    public static void main(String[] args) {
        int count=0;
        Child child1 = new Child("john");
        child1.join();count++;
        Child child2 = new Child("Nancy");
        child2.join();count++;
        Child child3 = new Child("Lucy");
        child3.join();count++;
        System.out.println("共有"+count+"小孩加入");
    }
}
class Child{
    private String name;
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+"加入了游戏...");
    }
}
