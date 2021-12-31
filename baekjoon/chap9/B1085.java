package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085 {
	
	static boolean prime[];
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int x= Integer.parseInt(st.nextToken());
		int y= Integer.parseInt(st.nextToken());
		int w= Integer.parseInt(st.nextToken());
		int h= Integer.parseInt(st.nextToken());
		
		int a = h-y;
		int b = w-x;
		int min = x; //a b y 
		if(min > y) {
			min = y;
		}
		if(min > a) {
			min = a;
		}
		if(min > b) {
			min = b;
		}
		System.out.println(min);
		
		
	}
	
	
}