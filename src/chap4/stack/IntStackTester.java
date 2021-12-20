package chap4.stack;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.print("1.푸시 2.팝 3. 피크 4. 덤프 0. 종료 : ");
			int menu = sc.nextInt();
			if(menu == 0) break;
			int x;

			switch(menu) {
				case 1:
					System.out.print("push data : ");
					x = sc.nextInt();
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("full stack");
					}
					break;
				case 2:
					try {
						x=s.pop();
						System.out.println("pop data : " + x);
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("stack empty");
					}
					break;
				case 3 :
					try {
						x = s.peek();
						System.out.println("peek data : " + x);
					} catch (IntStack.EmptyIntStackException e) {
						 System.out.println("stack empty");
					}
					break;

				case 4 :
					s.dump();
					break;
			}
		}
	}

 

}
