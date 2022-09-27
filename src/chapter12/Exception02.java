package chapter12;

/**
 * @author 韩坤
 * @version 1.0
 */
public class Exception02 {
    public static void main(String[] args) {
        int n1 = 0 ,n2 =0;
        int arr[]= { 1,2,3};
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(arr[i]);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("123");
        try {
            int s= n1/n2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("zhenfan");

    }
}
