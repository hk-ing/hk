package chapter11.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW07 {
    public static void main(String[] args) {
        Car car1 = new Car(90);
        Car car2 = new Car(10);
        Car car3 = new Car(-90);
      car1.F1();
      car2.F1();
      car3.F1();
    }
}
class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }
    class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("吹冷气");
            }
            else if(temperature<0){
                System.out.println("吹暖气");
            }
            else
                System.out.println("关闭空调");
        }
    }
    public void F1(){
        Air air = new Air();
        air.flow();
    }
}