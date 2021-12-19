package chap3.binarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int [] x= new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+ i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값은 : ");
		int key = sc.nextInt();
		sc.close();
		int idx = binSearch(x, num, key);
		if(idx == -1) {
			System.out.println("검색할 값은 존재하지 않습니다.");
		}else {
			System.out.println(idx);
		}
	}

	private static int binSearch(int[] x, int num, int key) {
		int pl = 0;
		int pr = num-1;
		
		do {
			int pc = (pl + pr) /2;
			if(x[pc]== key) {
				return pc;
			}else if(x[pc] < key) {
				pl = pc+1;
			}else {
				pr = pc-1;
			}	
		}while (pl <=pr);
		
		return -1;
	}

}
