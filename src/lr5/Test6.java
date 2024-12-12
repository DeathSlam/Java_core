package lr5;

public class Test6 {
    private int min;
    private int max;

    public Test6(int value1, int value2)
    {
        if(value1 > value2){
            this.max = value1;
            this.min = value2;
        }else {
            this.min = value1;
            this.max = value2;
        }
    }

    public Test6(int value1){
        if(value1 > this.max){
            this.max = value1;
        }
        if(value1 < this.min){
            this.min = value1;
        }
    }

    public void setValues(int value1, int value2)
    {
        if(value1 > value2){
            this.max = value1;
            this.min = value2;
        }else {
            this.min = value1;
            this.max = value2;
        }
    }

    public void setValues(int value1){
        if(value1 > this.max){
            this.max = value1;
        }
        if(value1 < this.min){
            this.min = value1;
        }
    }

    public void displayMinMax(){
        System.out.println("Max: " + max + " Min: " + min);
    }


    public static void main(String[] args) {
        Test6 minMax1 = new Test6(10);
        minMax1.displayMinMax();
        Test6 minMax2 = new Test6(15, 5);
        minMax2.displayMinMax();

        minMax1.setValues(-20);
        minMax1.displayMinMax();

        minMax2.setValues(20, 30);
        minMax2.displayMinMax();
    }
}
