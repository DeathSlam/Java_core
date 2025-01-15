package lr7.task3;

public class Task3 {
    public static void main(String[] args) {

        SuperClass superObj = new SuperClass(10);
        System.out.println(superObj.toString());

        SubClass subObj = new SubClass(20, 'A');
        System.out.println(subObj.toString());

        SubSubClass subSubObj = new SubSubClass(30, 'B', "Текст");
        System.out.println(subSubObj.toString());

        subSubObj.setValues(100, 'C', "Новый текст");
        System.out.println("После изменения значений: " + subSubObj.toString());
    }
}
