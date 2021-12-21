package chap6;

import java.util.Scanner;

public class BubbleSort3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("버블 정렬 버전 3");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int [] x = new int[nx];
		
		for(int i = 0; i < nx; i ++) {
			System.out.print("x["+ i + "] = ");
			x[i] = sc.nextInt();
		}
		sc.close();
		
		bubbleSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i = 0; i < nx; i ++) {
			System.out.println("x["+ i+ "] = "+ x[i]);
		}
	}

	private static void bubbleSort(int[] x, int nx) {
		int k = 0;
		while (k < nx-1) {
			int last = nx - 1;
			for(int j= nx-1; j > k; j--) {
				if(x[j-1]> x[j]) {
					swap(x, j-1, j);
					last = j;
				}
			}
			k = last;
		}
	}

	private static void swap(int[] x, int i, int j) {
		int t = x[i];
		x[i] = x[j];
		x[j] = t;
	}
	
	
	
}
