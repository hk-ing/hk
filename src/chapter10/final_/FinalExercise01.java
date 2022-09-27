package chapter10.final_;

import java.util.Scanner;

public class FinalExercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double n = scanner.nextDouble();
        System.out.println("圆的面积是："+cal.calculate(n));
    }

}
class cal{
    private static final double PI=3.14;
    private final double PI1;
    private final double PI2;
    public cal(){
        PI1=3.14;
    }
    {
        PI2=3.14;
    }
    public static double calculate(double radius){
        return PI*radius*radius;
    }
}