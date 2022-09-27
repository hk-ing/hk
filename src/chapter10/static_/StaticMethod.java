package chapter10.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu hk = new Stu("hk");
        hk.payFee(100);
        Stu ln = new Stu("ln");
        ln.payFee(100);
        Stu.showFee();
    }
}
class Stu{
    private String name;
    private static double fee =0;

    public Stu(String name) {
        this.name = name;
    }
    public void payFee(double fee){
        Stu.fee +=fee;
    }
    public static void showFee(){
        System.out.println("总的学费是："+Stu.fee);
    }

}
