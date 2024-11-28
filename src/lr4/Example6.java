package lr4;
import java.util.Random;
public class Example6 {
    public static void main(String[] args) {
        int row = 5, cols = 5;
        Random random = new Random();

        int[][] array = new int[row][cols];
        int[][] shortArray = new int [row][cols];

        int delRow = random.nextInt(row-1); int delCols = random.nextInt(cols-1);

        System.out.println("Удаляемая строка: " + delRow + " столбец: " + delCols);

        System.out.println("Исходный массив:");
        for (int i= 0; i < array.length; i++)
        {
            System.out.println("");
            for(int k = 0; k < array[i].length; k++)
            {
                array[i][k] = random.nextInt(10);
                System.out.print(array[i][k] + " ");
            }
        }

        System.out.println("\n\n" + "Короткий массив: ");
        for (int i = 0; i < shortArray.length; i++)
        {
            if(i != delRow) {
                System.out.println("");
                for (int k = 0; k < shortArray[i].length; k++) {
                    if(k != delCols) {
                        shortArray[i][k] = array[i][k];
                        System.out.print(array[i][k] + " ");
                    }
                }
            }
        }


    }
}
