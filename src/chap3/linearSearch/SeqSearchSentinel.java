package chap3.linearSearch;

import java.util.Scanner;

public class SeqSearchSentinel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int [] x= new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+ i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값은 : ");
		int key = sc.nextInt();
		sc.close();
		int idx = seqSearchSen2(x, num, key);
		if(idx == -1) {
			System.out.println("검색할 값은 존재하지 않습니다.");
		}else {
			System.out.println(idx);
		}
	}

	@SuppressWarnings("unused")
	private static int seqSearchSen(int[] x, int num, int key) {
		int i =0;
		x[num] = key;
		while(true) {
			if(x[i] == key) {
				break;
			}
			i++;
		}
		return i==num ? -1 : i;
	}
	private static int seqSearchSen2(int[] x, int num, int key) {
		int i =0;
		x[num] = key;
		
		for(int j = 0; j<num+1; j++) {
			if(x[j] == key) {
				i = j;
				break;
			}
		}
		
		return i==num ? -1 : i;
	}

}
