package lr7.task3;

public class SubSubClass extends SubClass{
    public String text;

    public SubSubClass(int number, char symbol, String text) {
        super(number, symbol);
        this.text = text;
    }


    public void setValues(int number, char symbol, String text) {
        super.setValues(number, symbol);
        this.text = text;
    }


    @Override
    public String toString() {
        return "SubSubClass: number = " + number + ", symbol = " + symbol + ", text = " + text;
    }
}
