package lr7.task2;

public class Task2 {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass("Hello, SuperClass");
        System.out.println(superObj.toString());
        System.out.println("Length of text: " + superObj.getTextLength());

        SubClass subObj = new SubClass("Hello, SubClass", 42);
        System.out.println(subObj.toString());
        System.out.println("Length of text: " + subObj.getTextLength());

        subObj.setValues();
        System.out.println("After setValues(): " + subObj.toString());

        subObj.setText("New Text");
        System.out.println("After setText(): " + subObj.toString());

        subObj.setValues(100);
        System.out.println("After setValues(int): " + subObj.toString());

        subObj.setValues("Final Text", 999);
        System.out.println("After setValues(String, int): " + subObj.toString());
    }
}
