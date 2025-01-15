package lr7.task1;

public class SuperClass {
    private String text;

    // Конструктор с текстовым параметром
    public SuperClass(String text) {
        this.text = text;
    }

    // Переопределённый метод toString()
    @Override
    public String toString() {
        return "SuperClass: text = " + text;
    }
}
