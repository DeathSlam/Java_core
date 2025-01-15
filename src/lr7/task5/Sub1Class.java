package lr7.task5;

public class Sub1Class extends SuperClass{
    protected int number;

    public Sub1Class(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() +
                ", текстовое поле: " + getText() +
                ", целочисленное поле: " + number);
    }
}
