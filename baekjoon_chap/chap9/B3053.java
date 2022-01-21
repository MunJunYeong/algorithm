package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3053 {
	
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double n = Double.parseDouble(br.readLine());
		
		
		System.out.println(n*n*Math.PI);
		System.out.println(2*n*n);
	}

	
}

