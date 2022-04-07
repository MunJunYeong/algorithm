package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class b1758 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Integer arr[] = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		long ans = 0;
		
		for(int i = 0; i<n; i++) {
			int temp = arr[i] - (i);
			if(temp >=0) {
				ans += temp;
			}
		}
		System.out.println(ans);
		
		
	}
	
}

	
	

