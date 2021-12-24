package chap8;

import java.util.Scanner;

public class B2292 {
	public static void main(String[] args)    {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		int count = 1;
		int range = 2;
		
		if(num == 1) {
			System.out.println(1);
		}else {
			while(range<= num) {
				range = range + (count * 6);
				count ++;
			}
			System.out.println(count);
		}
		
	}
}
