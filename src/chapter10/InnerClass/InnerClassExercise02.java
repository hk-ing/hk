package chapter10.InnerClass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });

    }

}
interface Bell{
    public void ring();
}
class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
