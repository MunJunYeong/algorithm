package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11399 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int arr[] = new int[num];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i < num; i ++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);

		int ans = arr[0];
		for(int i = 0; i < num; i++) {
			int temp = 0;
			if(i!=0) {
				for(int j = i; j >= 0; j--) {
					temp += arr[j];
				}
			}
			ans += temp;
		}
		System.out.println(ans);
		
	}
}
