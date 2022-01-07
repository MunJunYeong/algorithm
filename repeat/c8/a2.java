package c8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2 {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		// 2~7 7
		// 8~19 12
		int count =1;
		int range = 2;
		if(num == 1) {
			System.out.println(1);
		}else {
			while(range<=num) {
				range = range + (count*6);
				count++;
			}
			System.out.println(count);
		}
		
	}
}
