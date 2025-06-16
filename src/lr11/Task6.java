package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        int divisor;
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Список до: " + "\n");

        for(int i = 0; i < 10; i ++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        divisor = random.nextInt(10);

        System.out.println("Делитель: " + divisor + "\n");

        List<Integer> integersAfter = filterDivisible(integers, divisor);

        System.out.println("Список делимых: " + "\n");

        for (Integer e : integersAfter){
            System.out.println(e);
        }

    }

    public static List<Integer> filterDivisible(List<Integer> input, int divisor) {
        List<Integer> result = new ArrayList<>();
        for (int num : input) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        return result;
    }

}
