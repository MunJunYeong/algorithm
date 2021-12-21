package chap4.queue;

import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue que = new IntQueue(64);
		
		while(true) {
			System.out.print("1.인큐 2.디큐 3. 피크 4. 덤프 0. 종료 : ");
			int menu = sc.nextInt();
			if(menu == 0) break;
			int x;
		
			switch(menu) {
				case 1:
					System.out.print("data : ");
					x=sc.nextInt();
					try {
						que.enqueue(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("full Queue");
					}
					break;	
				
				case 2:
					try {
						que.dequeue();
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("empty queue");
					}
				case 3:
					x= que.peek();
					System.out.println(x);
			
			}
		}
	}

}
