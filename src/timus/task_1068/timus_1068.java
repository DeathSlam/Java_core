package timus.task_1068;

import java.util.Scanner;

public class timus_1068 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите конечное число");
		int num = in.nextInt();
		int sum = 0;

		 if (num >= 1) {
	            for (int i = 1; i <= num; i++) {
	                sum += i;
	            }
	        } else {
	            for (int i = 1; i >= num; i--) {
	                sum += i;
	            }
	        }
		
		 System.out.println(sum);
		
	}
	
}
