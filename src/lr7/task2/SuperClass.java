package lr7.task2;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTextLength() {
        return text != null ? text.length() : 0;
    }

    @Override
    public String toString() {
        return "SuperClass: text = " + text;
    }
}
