package lr9;

import java.util.LinkedList;

public class Task7_Linked {
    public static int linklist(int n){
        LinkedList<Integer> list = new LinkedList<>();
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
        System.out.println(linklist(n));
    }
}
