package lr2;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число");
		int num = in.nextInt();
		
		if (num >= 5 && num <= 10)
			System.out.println("Число отвечает критериям");
		else
			System.out.println("Число не отвечает критериям");

	}

}
