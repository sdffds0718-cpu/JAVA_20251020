package ex00;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        while (true) {
            String now = LocalDateTime.now().format(f);
            System.out.print("\r현재 시간: " + now);
            Thread.sleep(1000); // 1초마다 갱신
        }
    }
}


