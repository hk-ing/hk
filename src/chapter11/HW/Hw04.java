package chapter11.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class Hw04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testwork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {

                return n1+n2;
            }
        },3,3);
    }
}
interface ICalculate{
    double work(double n1 ,double n2);
}
class Cellphone {
    public void testwork(ICalculate iCalculate ,double n1,double n2){
        double resurt =iCalculate.work(n1,n2);
        System.out.println("计算的结果是："+resurt);
    }
}