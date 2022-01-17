package greedy_ten;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b5 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int alpha[]= new int[26];
		for(int i = 0; i < 26; i ++) {
			alpha[i] = 0;
		}
		for(int i = 0; i< num; i++){
			String s = br.readLine();
			int size = s.length();
			int base = (int) Math.pow(10, size-1);
			for(int j = 0; j < size; j++) {
				alpha[s.charAt(j)- 'A'] += base;
				base /= 10;
			}
		}
		Arrays.sort(alpha);
		int res = 0;
		for(int i = 25; i >= 17; i --) {
			res += alpha[i] * (i-16);
		}
		System.out.println(res);
		
	}
}
