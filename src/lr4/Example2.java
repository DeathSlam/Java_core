package lr4;

public class Example2 {
    public static void main(String[] args)
    {
        for(int i = 0; i <= 10; i++) {
            System.out.print("\n");
            for (int space = 10; space >= i; space--) System.out.print(" ");
            z = i*2;
            for(int j = 0; j < z; j++){
                System.out.print("+");
            }
        }
    }
}
