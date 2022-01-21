package bruce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(count(num));
		
	}

	private static int count(int num) {
		int count = 0;
		if(num <  100) {
			return num;
		}else {
			if(num == 1000) {
				num = 999;
			}
			count= 99;
			for(int i = 100; i <= num; i ++) {
				int a = i/100;
				int b = (i/10) %10;
				int c= i %10;
				if(a-b == b-c) {
					count ++;
				}
			}
		}
		return count;
	}
}

