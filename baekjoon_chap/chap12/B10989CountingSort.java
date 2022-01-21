package chap12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10989CountingSort {
	static int count =0 ;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[10001];
		
		int n = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < n; i++) {
			arr[Integer.parseInt(br.readLine())] ++;
		}
		br.close();
		for(int i=0; i < 10001; i++) {
			while(arr[i]>0) {
				sb.append(i).append("\n");
				arr[i]--;
			}
		}
		System.out.println(sb);
		
	}



	

	
	
	
}