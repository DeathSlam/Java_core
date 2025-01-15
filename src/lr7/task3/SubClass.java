package lr7.task3;

public class SubClass extends SuperClass {
    public char symbol;


    public SubClass(int number, char symbol) {
        super(number);
        this.symbol = symbol;
    }


    public void setValues(int number, char symbol) {
        super.setValues(number);
        this.symbol = symbol;
    }


    @Override
    public String toString() {
        return "SubClass: number = " + number + ", symbol = " + symbol;
    }
}
