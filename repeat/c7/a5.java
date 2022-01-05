package c7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a5 {

	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int arr[] = new int[26];
		for(int i =0; i < s.length(); i++) {
			if(s.charAt(i)>= 65 && s.charAt(i) <= 90) {
				arr[s.charAt(i) - 'A'] ++;
			}else
				arr[s.charAt(i)-'a'] ++;
		}
		
		int max = -1;
		char c = '?';
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				c= (char) (i+'A');
			}else if(arr[i]== max) {
				c = '?';
			}
		}
		System.out.println(c);
		
	}
	
}
