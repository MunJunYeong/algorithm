package chap3.linearSearch;

import java.util.Scanner;

public class SeqSearch {

	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int [] x= new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+ i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값은 : ");
		int key = sc.nextInt();
		sc.close();
		int idx = seqSearch(x, num, key);
		if(idx == -1) {
			System.out.println("검색할 값은 존재하지 않습니다.");
		}else {
			System.out.println(idx);
		}
	}
	//while문 이
	private static int seqSearch(int[] x, int num, int key) {
		int i=0;
		while(true) {
			if(i==num) {
				return -1;
			}
			if(x[i] == key) {
				return i;
			}
			i++;
		}
	}
	//for문을 이용
	@SuppressWarnings("unused")
	private static int seqSearch2(int[] x, int num, int key) {
		for(int i=0; i< num; i++) {
			if(x[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
