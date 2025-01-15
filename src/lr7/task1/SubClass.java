package lr7.task1;

public class SubClass extends SuperClass {
    private String additionalText;

    // Конструктор с одним текстовым аргументом
    public SubClass(String text) {
        super(text);
        this.additionalText = "По умолчанию"; // Значение по умолчанию
    }

    // Конструктор с двумя текстовыми аргументами
    public SubClass(String text, String additionalText) {
        super(text);
        this.additionalText = additionalText;
    }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "SubClass: " + super.toString() + ", additionalText = " + additionalText;
    }
}