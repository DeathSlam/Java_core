package timus;

import java.util.Scanner;

public class timus_1079 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int temp = 0;
		while(true) {
			int num = in.nextInt();
			if (num == 0) break;
			if (num > temp) temp = num;
		}
		System.out.println(temp);
	}

}
