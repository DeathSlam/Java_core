package lr4;

public class Example7 {
    public static void main(String[] args) {
        int row = 5, cols = 5, count = 1;
        int[][] array = new int[row][cols];


        for (int i = 0; i < array.length; i++)
        {
            if(i % 2 == 0){
                for (int k = 0; k < array[i].length; k++){array[i][k] = count; count++;}
            }
            else {
                for (int k = array[i].length - 1; k >= 0; k--){array[i][k] = count; count++;}
            }
        }

        for(int i = 0; i < array.length; i++)
        {
            System.out.println("");
            for (int k = 0; k < array[i].length; k++)
                System.out.print(array[i][k] + " ");
        }
    }
}
