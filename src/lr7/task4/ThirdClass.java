package lr7.task4;

public class ThirdClass extends SecondClass {
        public int number;

        public ThirdClass(char symbol, String text, int number) {
            super(symbol, text);
            this.number = number;
        }


        public ThirdClass(ThirdClass other) {
            super(other.symbol, other.text);
            this.number = other.number;
        }


        @Override
        public String toString() {
            return "ThirdClass: symbol = " + symbol + ", text = " + text + ", number = " + number;
        }
}
