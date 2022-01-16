package greedy_one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a8 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i = 0; i< n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int max = arr[0] * arr.length;
		for(int i = 1;  i< arr.length; i ++) {
			int temp = arr[i] * (arr.length-i);
			if(max  <= temp ) {
				max = temp;
			}
		}
		System.out.println(max);
		
	}
}

