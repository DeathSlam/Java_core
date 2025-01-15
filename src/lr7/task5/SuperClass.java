package lr7.task5;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", текстовое поле: " + text);
    }

    public String getText() {
        return text;
    }
}
