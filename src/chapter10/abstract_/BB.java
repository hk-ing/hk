package chapter10.abstract_;

public class BB {
    //获取程序运行时间
    public void work(){
        //得到开始时间
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 0; i < 800000; i++) {
            num+=i;
        }
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("程序运行时间："+(end-start));
    }
}
