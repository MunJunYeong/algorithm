package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class b20300 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Long arr[] = new Long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		
		long min = Integer.MIN_VALUE;
		
		if(n %2 == 0) {
			// 짝수일 때 	
			for(int i = 0; i < n/2; i++) {//7
				if(min < arr[i] + arr[n-i-1]) {
					min = arr[i] + arr[n-i-1];
				}
			}
		}else {
			min = arr[0] + arr[n-2];
			for(int i = 1; i < ((n-1)/2)-1; i++) {//7
				if(min < arr[i] + arr[n-i-2]) {
					min = arr[i] + arr[n-i-2];
				}
			}
			if(min < arr[n-1]) {
				min = arr[n-1];
			}
		}
		System.out.println(min);
		
		
	}
	
}

	
	

