package chapter10.interface_;

public class Phone implements Usb{
    @Override
    public void start() {
        System.out.println("手机工作");
    }

    @Override
    public void end() {
        System.out.println("结束工作");
    }
}
