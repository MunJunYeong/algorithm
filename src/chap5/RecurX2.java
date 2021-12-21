package chap5;

import java.util.Scanner;

import chap4.stack.IntStack;

public class RecurX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x= sc.nextInt();
		
		recur(x);
	}

	private static void recur(int x) {
		IntStack s = new IntStack(x);
		
		while(true) {
			if(x>0) {
				s.push(x);
				x -= 1;
				continue;
			}
			if(!s.isEmpty()) {
				x = s.pop();
				System.out.println(x);
				x -= 2;
				continue;
			}
			break;
		}
		
	}

}
