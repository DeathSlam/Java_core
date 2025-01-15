package lr7.task1;

public class Task1 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("SuperClass: ");
        SubClass subClassOneArg = new SubClass("SubClass: ");
        SubClass subClassTwoArgs = new SubClass("SubClass: ", "доп текст");

        System.out.println(superClass.toString());
        System.out.println(subClassOneArg.toString());
        System.out.println(subClassTwoArgs.toString());
    }
}
