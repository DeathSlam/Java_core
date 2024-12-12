package lr5;

public class Test1 {
    private char field;

    public void setField(char field){
        this.field = field;
    }

    public int getCode(){
        return (int) field;
    }

    public void symbolAndCode()
    {
        System.out.println("Символ: " + field + " Код символа: " + getCode());;
    }

    public static void main(String[] args) {
        Test1 char1 = new Test1();

        char1.setField('A');
        char1.symbolAndCode();

    }
}
