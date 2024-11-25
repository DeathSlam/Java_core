package lr4;

public class Example4 {
    public static void main(String[] args)
    {
        int width = 10, lenght = 20;
        int[][] array = new int[width][lenght];

        for(int i = 0; i < 10; i++)
        {
            for (int k = 0; k < 20; k++)
            {
                array[i][k] = 2;
            }
        }

        for(int i = 0; i < 10; i++)
        {
            System.out.println("");
            for (int k = 0; k < 10; k++)
            {
                System.out.print(array[i][k]);
            }
        }
    }
}
