package chapter11.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW06 {
    public static void main(String[] args) {
        Victory victory = new Victory("一般情况");
        Person person = new Person("唐僧", victory.IF());

        System.out.println(person.name );
        person.Ri();
    }
}
interface Vehicles{
   void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("骑马取经");
    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("坐船取经");
    }
}
class Person{
    public String name;
    private String vehicle;

    public Person(String name, String vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
    public void Ri(){
        if (vehicle.equals("boat")) {
            Boat boat = new Boat();
            boat.work();
        }
        else {
            Horse horse = new Horse();
            horse.work();
        }
    }
}
class Victory{
    public String situation;

    public Victory(String situation) {
        this.situation = situation;
    }

    public String getSituation() {
        return situation;
    }
    public String IF(){
        if (situation.equals("一般情况")){
            return "horse";
        }
        else
            return "boat";
    }

}