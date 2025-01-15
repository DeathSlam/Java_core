package lr7.task4;

public class SecondClass extends FirstClass{
    public String text;


    public SecondClass(char symbol, String text) {
        super(symbol);
        this.text = text;
    }

    public SecondClass(SecondClass other) {
        super(other.symbol);
        this.text = other.text;
    }

    @Override
    public String toString() {
        return "SecondClass: symbol = " + symbol + ", text = " + text;
    }
}
