package bruceforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2798 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sum = Integer.parseInt(st.nextToken());
		
		int a [] = new int[n];
		StringTokenizer st2= new StringTokenizer(br.readLine());
		for(int i =0; i < n; i++) {
			a[i] = Integer.parseInt(st2.nextToken());
		}
		
		int max = 0 ;
		for(int i = 0; i < n-2; i++) {
			for(int j=i+1; j < n-1; j++) {
				for(int k = j+1; k < n; k++) {
					int temp  = a[i] + a[j] + a[k];
					if(temp <= sum && max <= temp) {
						max = temp;
					}
				}
			}
		}
		System.out.println(max);
		
	}
}
