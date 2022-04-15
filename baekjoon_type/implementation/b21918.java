package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class b21918 {
	
	static int arr[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		arr= new int [n+1];
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			int c= Integer.parseInt(st.nextToken());
			
			if(a == 1){
				one(b, c);
			}
			if(a == 2){
				two(b, c);
			}
			if(a == 3){
				three(b, c);
			}
			if(a == 4){
				four(b, c);
			}
		}
		for(int i = 1; i < n+1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void one(int b, int c) {
		arr[b] = c;
	}

	private static void two(int b, int c) {
		for(int i = b; i <= c; i++) {
			if(arr[i] == 0) {
				arr[i] = 1;
			}else {
				arr[i] = 0;
			}
		}
	}

	private static void three(int b, int c) {
		for(int i = b; i <= c; i++) {
			arr[i] = 0;
		}
	}

	private static void four(int b, int c) {
		for(int i = b; i <= c; i++) {
			arr[i] = 1;
		}
	}
	
}

	
	

