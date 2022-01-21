package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
	
	public static void main(String[] args) throws NumberFormatException, IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int sum = 0;
		int min =0;
		for(int i =a; i <= b; i++) {
			if(isPrime(i)) {
				sum+= i;
				if(min ==0) {
					min = i;
				}
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}

	private static boolean isPrime(int i) {
		if(i == 1) {
			return false;
		}
		for(int j =  2; j < i; j++) {
			if(i%j ==0) {
				return false;
			}
		}
		return true;
	}
}