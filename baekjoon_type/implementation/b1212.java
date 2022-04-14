package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b1212 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String [] arr = new String[8];
		arr[0] = "000";
		arr[1] = "001";
		arr[2] = "010";
		arr[3] = "011";
		arr[4] = "100";
		arr[5] = "101";
		arr[6] = "110";
		arr[7] = "111";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			int temp=  s.charAt(i) - '0';
			sb.append(arr[temp]);
		}
		if(sb.substring(0, 1).equals("0")) {
			sb.deleteCharAt(0);
		}
		if(sb.substring(0, 1).equals("0")) {
			sb.deleteCharAt(0);
		}
		
		System.out.println(sb);
		
	}
	
}

	
	

