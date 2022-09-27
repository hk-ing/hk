package chapter11.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW08 {
    public static void main(String[] args) {
        Color[] values = Color.values();
        for(Color color : values){
            switch (color){
                case RED :
                    System.out.println("RED:");
                    color.show();break;
                case BLUE:
                    System.out.println("Blue:");
                    color.show();break;
                case BLACK:
                    System.out.println("Black:");
                    color.show();break;
                case YELLOW:
                    System.out.println("Yellow");
                    color.show();break;
                case GREEN:
                    System.out.println("Green:");






            }
        }

    }
}
enum Color implements IS{
    RED(255,0,0),
    BLUE(0,0,255),
    YELLOW(255,255,0),
    BLACK(0,0,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("redValue:"+redValue+"\t"+"greenValue:"+greenValue+"\t"+"blueValue:"+blueValue);
    }
}
interface IS{
    void show();
}