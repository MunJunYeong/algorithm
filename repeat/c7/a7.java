package c7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a7 {
	
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		StringTokenizer st =new StringTokenizer(s);
		
		int a = change(Integer.parseInt(st.nextToken()));
		int b = change(Integer.parseInt(st.nextToken()));
		
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
		
		
	}

	private static int change(int a) {
		int hun = a/100;
		int ten = (a/10) %10;
		int one = a%10;
		return one*100 + ten*10 + hun;
	}

	
	
}

