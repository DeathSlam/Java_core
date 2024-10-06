package lr1;

import java.util.Scanner;
import java.time.Year;

public class Example12 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст");
        int year = Math.abs( in.nextInt() - Year.now().getValue()) ;

        System.out.println("Вы " + year + " года рождения");


    }

}
