package bruce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n ; i ++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(arr);
		
		int max = 0;
		for(int i = 0 ; i < n-2; i++) {
			for(int j = i+1; j < n-1; j++) {
				for(int k = j+1; k <n; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					if(max < temp && temp <=sum) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);
	}

}
