package c7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a3 {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max =1;
		for(int i = 0; i < 3; i++) {
			max *= Integer.parseInt(br.readLine());
		}
		int[] arr = new int[10];
		
		while(max >= 1) {
			int a = max%10;
			arr[a]++;
			max = max/10;
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
