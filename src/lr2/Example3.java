package lr2;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число");
		int num = in.nextInt();
		
		if (num % 4 == 0 && num < 10)
			System.out.println("Число отвечает критериям");
		else
			System.out.println("Число не отвечает критериям");

	}

}
