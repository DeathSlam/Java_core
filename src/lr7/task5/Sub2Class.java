package lr7.task5;

public class Sub2Class extends SuperClass{
    protected char symbol;

    public Sub2Class(String text, char symbol) {
        super(text);  // Вызов конструктора суперкласса
        this.symbol = symbol;
    }

    @Override
    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() +
                ", текстовое поле: " + getText() +
                ", символьное поле: " + symbol);
    }
}
