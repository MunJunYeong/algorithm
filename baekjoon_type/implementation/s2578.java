package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class s2578 {
	
	static int n;
	static int arr[][];
	static int cnt = 0;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		 n = Integer.parseInt(br.readLine());
		 arr = new int[5][5];
		 
		 for(int i = 0 ; i < 5; i ++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 for(int j = 0; j < 5; j++) {
				 arr[i][j] = Integer.parseInt(st.nextToken());
			 }
		 }
		 
		 int ans[] = new int[25];
		 int k = 0;
		 for(int i = 0 ; i < 5; i ++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 for(int j = 0; j < 5; j++) {
				ans[k++] = Integer.parseInt(st.nextToken());
			 }
		 }
		 
		 
		 for(int a = 0; a < 25; a++) {
			 
			 int temp = ans[a];
			 for(int i = 0; i < 5; i++) {
				 for(int j = 0; j < 5; j++) {
					 if(temp == arr[i][j]) {
						 arr[i][j] = 0;
					 }
				 }
			 }
			 
			 rowCheck(); //열
			 colCheck(); //행 
			 leftToRight(); //왼쪽에서 오른쪽 대각선 
			 rightToLeft();
			 if(cnt >= 3) {
				 System.out.println(a+1); break;
			 }
			 cnt = 0;
			 
		 }
		 
	}

	private static void rightToLeft() {
		int zero = 0;
		for(int i =0; i < 5; i++) {
			if(arr[i][4-i] == 0) {
				zero++;
			}
		}
		if(zero == 5) {
			cnt ++;
		}
	}

	private static void leftToRight() {
		int zero = 0;
		for(int i =0; i < 5; i ++) {
			if(arr[i][i] == 0) {
				zero++;
			}
		}
		if(zero == 5) {
			cnt ++;
		}
	}

	private static void colCheck() {
		for(int i = 0; i < 5; i++) {
			int zero = 0;
			for(int j = 0; j < 5; j++) {
				if(arr[j][i] == 0) {
					zero++;
				}
			}
			if(zero == 5) {
				cnt ++;
			}
		}
		
	}

	private static void rowCheck() {
		for(int i = 0; i < 5; i++) {
			int zero = 0;
			for(int j = 0; j < 5; j++) {
				if(arr[i][j] == 0) {
					zero++;
				}
			}
			if(zero == 5) {
				cnt ++;
			}
		}
	}

}

	
	

