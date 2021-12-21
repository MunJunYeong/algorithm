package chap6;

import java.util.Scanner;

public class InsertionSort {
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
		
		insertionSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i = 0; i < nx; i ++) {
			System.out.println("x["+ i+ "] = "+ x[i]);
		}
	}

	private static void insertionSort(int[] x, int n) {
		for(int i =1; i<n; i++) {
			int j;
			int temp = x[i];
			for(j = i; j >0 && x[j-1] > temp; j--) {
				x[j] = x[j-1];
			}
			x[j] = temp;
		}
	}
}
