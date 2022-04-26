package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class g20164 {
	
	static String n;
	static int[][] arr;
	static int[][] train;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n  = br.readLine();
		split(n, 0);
		
		System.out.println(min + " " + max);
		
		
	}
	private static void split(String num, int cnt) {
		cnt += countOdd(num);
		
		int len = num.length();
		int sum = 0;
		
		if(len == 1) {
			max = Math.max(max, cnt);
			min = Math.min(min, cnt);
		}else if(len == 2) {
			sum = num.charAt(0)-'0' + num.charAt(1)-'0';
			split(Integer.toString(sum), cnt);
		}else {
			for(int i = 1; i < len-1; i++) {
				for(int j = i+1; j < len; j++) {
					sum = SumStr( num.substring(0, i), num.substring(i, j), num.substring(j, len));
					split(Integer.toString(sum), cnt);
				}
				
			}
		}
		
	}
	private static int SumStr(String substring, String substring2, String substring3) {
		int a = Integer.parseInt(substring);
		int b = Integer.parseInt(substring2);
		int c = Integer.parseInt(substring3);
		return a+b+c;
	}
	private static int countOdd(String num) {
		int cnt = 0;
		for(int i =  0; i < num.length(); i++) {
			int temp = num.charAt(i) - '0';
			if(temp% 2 == 1) {
				cnt ++;
			}
		}
		return cnt;
	}
}