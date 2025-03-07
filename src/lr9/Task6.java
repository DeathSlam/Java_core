package lr9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Арбуз");
        hashMap.put(2, "Банан");
        hashMap.put(3, "Яблоко");
        hashMap.put(4, "Киви");
        hashMap.put(5, "Апельсин");
        hashMap.put(6, "Огурец");
        hashMap.put(7, "Помидор");
        hashMap.put(8, "Авокадо");
        hashMap.put(9, "Капуста");
        hashMap.put(0, "Кинза");

        System.out.println("Ключ > 5: ");
        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            if (entry.getKey() > 5){
                System.out.println(entry.getValue() + " ");
            }
        }

        if(hashMap.containsKey(0)){
            System.out.println("Ключ 0: " + hashMap.get(0));
        }

        int result = 1;

        for(Map.Entry<Integer, String> entry : hashMap.entrySet()){
            if (entry.getKey() > 5){
                result *= entry.getKey();
            }
        }
        System.out.println("Перемножение ключ>5: " + result);
    }
}
