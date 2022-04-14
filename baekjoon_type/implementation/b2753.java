package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b2753 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int res = 0;
		
		if(n % 4 ==0) {
			if(n % 100 != 0 || n%400 == 0) {
				res = 1;
			}
		}
		System.out.println(res);
	}
	
}

	
	

