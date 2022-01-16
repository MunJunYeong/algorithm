package greedy_ten;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b1 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int [] arr= new int[s.length()];
		
		for(int i =0; i < arr.length; i ++) {
			arr[i] = s.charAt(i) - '0';
		}
		Arrays.sort(arr);
		
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length-1; i >=0; i--) {
			sum += arr[i];
			sb.append(arr[i]);
		}
		if(arr[0] != 0 || sum%3 !=0) {
			System.out.println(-1);
		}else {
			System.out.println(sb);
		}
		
	}
}

