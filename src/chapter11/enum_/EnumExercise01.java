package chapter11.enum_;

/**
 * @author 韩坤
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        week[] values = week.values();
        for (week n:values){
            System.out.println(n);
        }
        week.MONDAY.play();
    }

}
enum week implements IPlay{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"), SATURDAY("星期六"),SUNDAY("星期天");
    private String name;

    week(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("test");
    }
}
interface IPlay{
    public void play();
}
