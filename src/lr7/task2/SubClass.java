package lr7.task2;

import lr7.task2.SuperClass;

public class SubClass extends SuperClass {
    public int number;

    public SubClass(String text, int number) {
        super(text);
        this.number = number;
    }

    public void setValues() {
        super.setText("Default Text");
        this.number = 0;
    }

    @Override
    public void setText(String text) {
        super.setText(text);
    }

    public void setValues(int number) {
        this.number = number;
    }

    public void setValues(String text, int number) {
        super.setText(text);
        this.number = number;
    }

    @Override
    public String toString() {
        return "SubClass: text = " + super.toString().split("=")[1].trim() + ", number = " + number;
    }
}
