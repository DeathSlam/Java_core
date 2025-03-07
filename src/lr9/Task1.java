package lr9;

public class Task1 {
    public static void ChislR(int x)
    {
        System.out.println("x= " + x);
        if((2*x+1) < 20)
        {
            ChislR(2 * x + 1);
        }
    }

    public static void reverbChislR(int x){
        if((2*x+1) < 20)
        {
            reverbChislR(2 * x + 1);
        }
        System.out.println("x= " + x);
    }

    public static int step=0;
    public static void RecursionDeep(int x){
        space();
        System.out.println("" + x + "-> ");
        step ++;
        if((2*x+1) < 20)
        {
            RecursionDeep(2 * x + 1);
        }
        step --;
        space();
        System.out.println("" + x + " <-");
    }

    public static void space(){
        for(int i = 0; i < step; i++){
            System.out.println(" ");
        }
    }

    public static int factorial(int n){
        int result;
        if (n == 1) return 1;
        else {
            result = factorial(n -1) * n;
            return result;
        }
    }

    public static int fibonach(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonach(n-2) + fibonach(n -1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Пример 1:");
        ChislR(1);
        System.out.println("Пример 2:");
        reverbChislR(1);
        System.out.println("Пример 3:");
        RecursionDeep(1);
        System.out.println("Пример 4:");
        System.out.println(factorial(5));
        System.out.println("Пример 5:");
        System.out.println(fibonach(5));
    }
}
