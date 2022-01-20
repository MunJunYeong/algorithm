package bruceforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(count(n)); 
	}

	private static int count(int n) {
		int count = 0;
		if(n < 100) {
			return n;
		}else {
			count = 99;
			if(n == 1000) {
				n = 999;
			}
			for(int i = 100; i<= n; i++) {
				int a = i/100;
				int b = (i/10)%10;
				int c = i%10;
				if(a-b == b-c) {
					count ++;
				}
			}
		}
		return count;
	}
}
