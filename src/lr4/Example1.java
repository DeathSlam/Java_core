package lr4;

public class Example1 {
    public static void main(String[] args)
    {
        int lenght = 11;
        int width = 23;
        int i;
        int j;
        int z;

        for (i = 0; i <= lenght; i++)
        {
            System.out.println("");
            z = 0;
            for (j = -5; j < width; j++)
            {
                System.out.print("+");
                z = z + 1;
            }
        }
    }
}
