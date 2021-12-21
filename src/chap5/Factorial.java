package chap5;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		System.out.println(num + "의 팩토리얼은 "+ factorial(num) + "입니다.");
		
	}

	private static int factorial(int num) {
		if(num > 0) {
			return num * factorial(num-1);
		}
		return 1;
	}
}
