package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1339 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int [] alpha = new int[26];
		Arrays.fill(alpha, 0);
		
		
		for(int i =0; i < num; i++) {
			String line = br.readLine();
			
			int size = line.length();
			int base = (int) Math.pow(10, size-1);
			for(int j = 0; j < size; j++) {
				alpha[line.charAt(j)-'A'] += base;
				base = base/10;
			}
		}
		Arrays.sort(alpha);
		int result = 0;
		for(int i = 25; i >= 17; i--) {
			result += alpha[i]*(i-16);
		}

		System.out.println(result);
	}
}
