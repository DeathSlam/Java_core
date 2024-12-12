package lr5;

public class Test5 {
    private int intField;

    public Test5(){
        this.intField = 0;
    }

    public Test5(int intField){
        if(intField > 100){
            this.intField = 100;
        } else {
            this.intField = intField;
        }
    }

    public void setInt(){
        this.intField = 0;
    }

    public void setInt(int intField){
        if(intField > 100){
            this.intField = 100;
        } else {
            this.intField = intField;
        }
    }

    public int getIntField(){
        return this.intField;
    }

    public static void main(String[] args) {
        Test5 field1 = new Test5();
        System.out.println(field1.getIntField());
        Test5 field2 = new Test5(10);
        System.out.println(field2.getIntField());

        field1.setInt(50);
        System.out.println(field1.getIntField());

        field2.setInt(150);
        System.out.println(field2.getIntField());

    }
}
