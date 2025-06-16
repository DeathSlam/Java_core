package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Список до: " + "\n");

        for(int i = 0; i < 10; i ++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }


        List<Integer> integersAfter = filterGreater(integers, 525);

        System.out.println("Список после: " + "\n");

        for (Integer e : integersAfter){
            System.out.println(e);
        }

    }
    public static List<Integer> filterGreater(List<Integer> input, int minNum) {
        List<Integer> result = new ArrayList<>();
        for (int num : input) {
            if (num > minNum) {
                result.add(num);
            }
        }
        return result;
    }
}
