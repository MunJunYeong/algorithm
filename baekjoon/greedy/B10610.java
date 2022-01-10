package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10610 {
public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		
		int a[] = new int[s.length()];
		
		for(int i = 0; i <s.length(); i ++) {
			a[i] = s.charAt(i) - 48;
		}
		
		Arrays.sort(a);
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = a.length-1; i >=0 ; i--){
			sum += a[i];
			sb.append(a[i]);
		}
		if(a[0] != 0 || sum%3 !=0) {
			System.out.println(-1);
		}else {
			System.out.println(sb);
		}
		
	}
}
