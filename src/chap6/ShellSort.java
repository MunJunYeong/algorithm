package chap6;

import java.util.Scanner;

public class ShellSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단순 삽입 정렬 ");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int [] x = new int[nx];
		
		for(int i = 0; i < nx; i ++) {
			System.out.print("x["+ i + "] = ");
			x[i] = sc.nextInt();
		}
		sc.close();
		
		ShellSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i = 0; i < nx; i ++) {
			System.out.println("x["+ i+ "] = "+ x[i]);
		}
	}

	private static void ShellSort(int[] x, int n) {
		for(int h = n/2; h > 0; h/= 2) {
			for(int i =h; i < n; i++) {
				int j;
				int tmp = x[i];
			}
		}
	}

	
}
