package lr7.task3;

public class SuperClass {
    public int number;


    public SuperClass(int number) {
        this.number = number;
    }


    public void setValues(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "SuperClass: number = " + number;
    }
}
