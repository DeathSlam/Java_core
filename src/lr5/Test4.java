package lr5;

public class Test4 {
    private char charField;
    private int intField;

    public Test4(char charField, int intField){
        this.charField = charField;
        this.intField = intField;
    }

    public Test4(double code){
        int firstPart = (int) code;
        this.charField = (char) firstPart;

        double secondPart = code - firstPart;
        this.intField = (int) (secondPart*100);
    }

    public void displayValues()
    {
        System.out.println("Символ: " + charField + " Число: " + intField);
    }

    public static void main(String[] args) {
        Test4 test1 = new Test4('X', 56);
        test1.displayValues();

        Test4 test2 = new Test4(65.1267);
        test2.displayValues();
    }
}
