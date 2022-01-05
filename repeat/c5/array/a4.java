package c5.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a4 {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean [] flag = new boolean[42];
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(br.readLine()) % 42;
			flag[n] = true;
		}
		
		int count = 0;
		for(int i = 0; i < 42; i++) {
			if(flag[i]) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}
