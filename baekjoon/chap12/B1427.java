package chap12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1427 {
	
	
	public static void main(String[] args) throws IOException   {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int []a = new int[s.length()];
		for(int i =0; i < s.length(); i++ ) {
			a[i] = s.charAt(i) - '0';
		}
		Arrays.sort(a);
		for(int i =a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}	
	
}

