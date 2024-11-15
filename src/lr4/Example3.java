package lr4;

public class Example3 {
    public static void main(String[] args)
    {
        int lenght = 10, width = 15;
        int[][] array = new int[lenght][width];

        for(int i = 0;i < lenght; i++)
        {
            for (int k = 0; k < width; k++)
            {
                array[i][k] = 2;
            }
        }
        for(int i = 0;i < lenght; i++)
        {
            System.out.println(" ");
            for (int k = 0; k < width; k++)
            {
                System.out.print(array[i][k]);;
            }
        }
    }
}
