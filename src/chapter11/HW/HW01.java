package chapter11.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}
class Frock{
    private int serialNumber;
    private static int currentNum=1000000;

    public Frock() {
      this.serialNumber = getNextNum();
    }

    public static int getNextNum(){
        return  currentNum+=100;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
}