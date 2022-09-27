package chapter13.HW;

/**
 * @author 韩坤
 * @version 1.0
 */
public class HW02 {
    public static void main(String[] args) {
        String name = "java";
        String pwd = "123456";
        String email = "java@qq.com";
        try {
            User(name, pwd, email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }

    public static void User(String name, String pwd, String email) {
        if (!(name.length() == 2 || name.length() == 3 || name.length() == 4))
            throw new RuntimeException("用户名输入有误");

        if (!(pwd.length() == 6 && isDgital(pwd)))
            throw new RuntimeException("密码输入有误");

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱输入有误");
        }
    }

    public static boolean isDgital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' && chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
