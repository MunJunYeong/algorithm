package chap8;

import java.util.Scanner;

public class B1193 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int cross = 1; 
		int sum =0;
		
		while(true) {
			
			if(num <= sum + cross) {
				if(cross % 2 == 1) {
					System.out.println((cross - (num-sum-1)) + "/" + (num-sum));
					break;
				}else {
					System.out.println( (num-sum) + "/" + (cross - (num-sum-1))  );
					break;
				}
			}else {
				sum = sum + cross;
				cross++;
			}
			
			
		}
		
	}
}