package chapter12.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW01 {
    public static void main(String[] args) {

        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("输入参数不对");
            }
            /*
            parseInt(String s)函数是将字符串类型的数据转换为整数型数据；
            要求字符串除了第一个字符可以是“＋”或者“-”以外，其他字符必须是十进制字符
             */
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("分母不能为零");
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输入整数");
        }
    }

    static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
