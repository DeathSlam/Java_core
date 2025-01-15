package lr7.task4;

public class Task4 {
    public static void main(String[] args) {
        FirstClass firstObj = new FirstClass('A');
        FirstClass firstCopy = new FirstClass(firstObj);
        System.out.println("Оригинал: " + firstObj.toString());
        System.out.println("Копия: " + firstCopy.toString());

        SecondClass secondObj = new SecondClass('B', "Текст");
        SecondClass secondCopy = new SecondClass(secondObj);
        System.out.println("Оригинал: " + secondObj.toString());
        System.out.println("Копия: " + secondCopy.toString());

        ThirdClass thirdObj = new ThirdClass('C', "Другой текст", 123);
        ThirdClass thirdCopy = new ThirdClass(thirdObj);
        System.out.println("Оригинал: " + thirdObj.toString());
        System.out.println("Копия: " + thirdCopy.toString());
    }
}
