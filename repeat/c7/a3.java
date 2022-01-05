package c7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a3 {
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int[] arr = new int[26];
		for(int i =0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for(int i =0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(arr[c-'a'] == -1) {
				arr[c-'a'] = i;
			}
		}
		for(int v : arr) {
			System.out.print(v + " ");
		}
		
		
	}
}
