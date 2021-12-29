package chap9;

import java.util.Scanner;

public class B2581 {
	
	static boolean prime[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		
		prime = new boolean[b+1];
		get_prime();
		
		int sum = 0;
		int min = 0;
		for(int i = a; i<=b; i++) {
			if(prime[i] == false) {
				sum =+i;
				if(min == 0) {
					min = i;
				}
			}
		}
		if(sum == 0 ) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

	private static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			for(int j = i*i; j < prime.length; j+=1) {
				prime[j] = true;
			}
		}
	}
}
