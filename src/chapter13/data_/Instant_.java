package chapter13.data_;

import java.sql.Date;
import java.time.Instant;

/**
 * @author 韩坤
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        java.util.Date from = Date.from(now);

    }
}
