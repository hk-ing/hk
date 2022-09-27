package chapter13.arrays_;

import java.util.Arrays;

/**
 * @author 韩坤
 * @version 1.0
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        Book book[] = new Book[4];
        book[0] = new Book("红楼梦", 100);
        book[1] = new Book("西游记", 90);
        book[2] = new Book("青年文摘", 5);
        book[3] = new Book("java从入门到放弃", 300);
        Arrays.sort(book);
        System.out.println(Arrays.toString(book));

    }
}

class Book {
    public String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }
}