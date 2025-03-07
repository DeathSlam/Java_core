package lr9;

import java.util.ArrayList;

public class Task7_Array {
    public static int arrlist(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        int count = 0;
        while (list.size() > 1){
            count= (count + 1) % list.size();
            list.remove(count);
        }
        return list.get(0);
    }



    public static void main(String[] args) {
        int n = 1000;
        System.out.println(arrlist(n));
    }
}
