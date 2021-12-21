package chap6;

import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단순 선택 정렬 ");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int [] x = new int[nx];
		
		for(int i = 0; i < nx; i ++) {
			System.out.print("x["+ i + "] = ");
			x[i] = sc.nextInt();
		}
		sc.close();
		
		selectionSort(x, nx);
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for(int i = 0; i < nx; i ++) {
			System.out.println("x["+ i+ "] = "+ x[i]);
		}
	}

	private static void selectionSort(int[] x, int nx) {
		for(int i =0; i < nx-1; i++) {
			int min = i;
			for(int j = i+1; j < nx; j++) {
				if(x[j] < x[min]) {
					min = j;
				}
			}
			swap(x, i , min);
		}
	}
	private static void swap(int[] x, int i, int j) {
		int t = x[i];
		x[i] = x[j];
		x[j] = t;
	}
	
}
