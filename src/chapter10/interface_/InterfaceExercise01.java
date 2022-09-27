package chapter10.interface_;

public class InterfaceExercise01 extends BB implements IC{
    public void px(){
        System.out.println(super.x);
    }
    public static void main(String args[]){
        new InterfaceExercise01().px();
    }
}
interface IC{
    int x=0;
}
class BB{
    int x =1;
}