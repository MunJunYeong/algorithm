package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11653 {
	
	static boolean prime[];
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int i =2;
		while(i <= num) {
			if(num%i ==0) {
				System.out.println(i);
				num = num/i;
			}else {
				i++;
			}
		}
		
		
	}
	
	
}