package lr7.task5;

public class Task5 {
    public static void main(String[] args) {

        SuperClass superObj = new SuperClass("Текст суперкласса");
        Sub1Class subObjOne = new Sub1Class("Текст первого подкласса", 100);
        Sub2Class subObjTwo = new Sub2Class("Текст второго подкласса", 'A');


        System.out.println("=== Прямой вызов методов ===");
        superObj.displayInfo();
        subObjOne.displayInfo();
        subObjTwo.displayInfo();


        System.out.println("\n=== Вызов через объектную переменную суперкласса ===");
        SuperClass ref;

        ref = subObjOne;
        ref.displayInfo();

        ref = subObjTwo;
        ref.displayInfo();
    }
}
