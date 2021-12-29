package chap8;

import java.util.Scanner;

public class B1193 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int cross = 1; //현재 대각선의 원소 개수
		int sum =0; //1부터 현재 대각선-1 까지의 원소 개수
		
		while(true) {
			
			if(num <= sum + cross) {
				if(cross % 2 == 1) { //홀수 일 때 위에서 아래로
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