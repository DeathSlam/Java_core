package lr7.task4;

public class FirstClass {
    public char symbol;

    public FirstClass(char symbol) {
        this.symbol = symbol;
    }

    public FirstClass(FirstClass other) {
        this.symbol = other.symbol;
    }

    @Override
    public String toString() {
        return "FirstClass: symbol = " + symbol;
    }
}
