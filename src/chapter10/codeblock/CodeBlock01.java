package chapter10.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie 都挺好 = new Movie("都挺好");
        Movie movie = new Movie("啥玩意", 100, "韩坤");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;

    {
        System.out.println("代码块练习1");
        System.out.println("代码块练习2");
        System.out.println("代码块练习3");
    }
    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }

}
