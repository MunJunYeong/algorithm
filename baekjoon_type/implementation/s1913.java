package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s1913 {
	
	static int n;
	static int arr[][];
	static int cnt = 0;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 n = Integer.parseInt(br.readLine());
		 int ans = Integer.parseInt(br.readLine());
		 arr = new int[n][n];
		 //row = 가로,  col = 세로 
		 makeArr();
		 
		 int y = 0; int x = 0;
		 for(int i = 0; i < n; i++) {
			 for(int j = 0; j < n; j++) {
				 if(arr[i][j] == ans) {
					 y = i+1; x = j+1;
				 }
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }
		 System.out.println(y + " " + x);
		 
	}


	private static void makeArr() {
		int value = n*n;
		int x, y = 0;
		int time = 0;
		int limit = n;
		
		while(value > 0) {
			x = time;
			for(int i = y; i < limit; i ++ ) {
				arr[i][x] = value--;
			}
			
			y = limit-1;
			for(int i = x+1; i < limit; i++) {
				arr[y][i] = value--;
			}
			
			x = limit-1;
			for(int i = y-1; i >=time; i--) {
				arr[i][x] = value--;
			}
			
			y = time;
			for(int i = x-1; i > time; i--) {
				arr[y][i] = value--;
			}
			
			limit--;
			time++;
			y = time;
		}
		
		
		
	}



}

	
	

