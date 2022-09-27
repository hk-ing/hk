package chapter10.abstract_;

public class Abstractor02 {
    public static void main(String[] args) {
        CommonEmployer zcj = new CommonEmployer("zcj", "01", 1000);
        Manager hk = new Manager("hk", "01", 99999, 10000);
        zcj.work();
        hk.work();
    }
}
