package chap5;

import java.util.Scanner;

import chap4.stack.IntStack;

public class HanoiX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("하노이의  탑 ");
		System.out.print("원반 개수 : ");
		int n = sc.nextInt();
		
		move(n, 1, 3);
	}
	// x는 시작 기둥의 번호, y는 목표 기둥의 번호 
	private static void move(int n, int x, int y) {
		IntStack a = new IntStack(100);
		IntStack b = new IntStack(100);
		IntStack c = new IntStack(100);
		int ptr = 0;
		int sw = 0;
		
		
		
		while(true) {
			
			
		}
		
//		if(n > 1) {
//			move(n-1, x, 6-x-y);
//		}
//		System.out.println("원반["+n+"]을 "+ x + "기둥에서 "+ y+ "기둥으로 옮김. ");
//		if(n > 1) {
//			move(n-1, 6-x-y, y);
//		}
	}
}
