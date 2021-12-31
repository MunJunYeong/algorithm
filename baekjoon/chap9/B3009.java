package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3009 {
	
	static boolean prime[];
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		String s3 = br.readLine();
		StringTokenizer st1 = new StringTokenizer(s1);
		StringTokenizer st2 = new StringTokenizer(s2);
		StringTokenizer st3 = new StringTokenizer(s3);
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[2];
		for(int i = 0; i < 2; i++) {
			a[i] = Integer.parseInt(st1.nextToken());
		}
		for(int i = 0; i < 2; i++) {
			b[i] = Integer.parseInt(st2.nextToken());
		}
		for(int i = 0; i < 2; i++) {
			c[i] = Integer.parseInt(st3.nextToken());
		}
		int res[] = new int[2];
		for(int i = 0; i<2; i++) {
			res[i] = fineResult(a[i], b[i], c[i]);
		}
		System.out.println(res[0] + " " + res[1]);
		
		
	}

	private static int fineResult(int a, int b, int c) {
		int temp  = 0;
		if(a ==b) {
			temp = c;
		}else if(a == c) {
			temp = b;
		}else if(b == c) {
			temp = a;
		}
		return temp;
	}
	
	
}