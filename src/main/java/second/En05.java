package second;

import java.util.Date;

public class En05 {
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();

        System.out.println("現在の日時（ミリ秒）："+ time);
        System.out.println("※UTC(1970/1/1/00:00:00)からの経過ミリ秒");
    }
}
