package lr4;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int width = 5, lenght = 3;
        Random random = new Random();
        int[][] array = new int[lenght][width];
        int[][] transArray = new int[width][lenght];

        for(int i = 0; i < array.length; i++)//Заполнение массива
        {
            for (int k = 0; k < array[i].length; k++)
                array[i][k] =  random.nextInt(30);
        }

        System.out.println("Исходный массив");//Вывод исходного массива
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("");
            for (int k = 0; k < array[i].length; k++)
                System.out.print(array[i][k] + " ");
        }


        for(int i = 0; i < transArray.length; i++)//Перенос массива
        {
            for (int k = 0; k < transArray[i].length; k++)
                transArray[i][k] = array[k][i];
        }

        System.out.println( "\n"+ "Перевернутый массив");//Вывод транспонированного массива
        for(int i = 0; i < transArray.length; i++)
        {
            System.out.println("");
            for (int k = 0; k < transArray[i].length; k++)
                System.out.print(transArray[i][k] + " ");
        }
    }
}
