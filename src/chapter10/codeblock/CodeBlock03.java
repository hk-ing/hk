package chapter10.codeblock;
//在存在继承关系时，静态代码块和静态属性，普通代码块和普通属性，构造方法调用是内需遵循以下规则：
//先调用完所有的静态属性和方法（父类优先，子类次之）
//随后按照优先原则，先调用父类的非静态、构造器再调用子类的非静态和构造器

public class CodeBlock03 {
    public static void main(String[] args) {
       new AA();
    }
}

class AA extends BB{
    public AA() {
        System.out.println("AA的构造器被调用...");
    }
    static{
        System.out.println("AA的静态代码块被调用...");
    }
}

class BB {
    {
        System.out.println("BB的普通代码块...");
    }
    public BB() {
        System.out.println("BB的构造器被调用...");
    }
    static {
        System.out.println("BB的静态代码块被调用...");
    }
}