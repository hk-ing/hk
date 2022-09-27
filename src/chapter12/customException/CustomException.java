package chapter12.customException;

/**
 * @author 韩坤
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 280;
        //要求范围在18-120之间，否则抛出一个自定义异常
        if (!(age>=18&&age<=120)){
            throw new AgeException("年龄需要在18~120之间");
        }else
            System.out.println("输入正确");
    }
}

//自定义一个异常
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}