package lr12;

import java.time.LocalTime;

public class Task4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Поток № " + threadNumber);
            });
            thread.start();
        }
    }
}
