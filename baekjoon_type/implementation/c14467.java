package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class c14467 {
	
	static int arr[];
	static int n;
	static int cow[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 n = Integer.parseInt(br.readLine());
		 cow = new int[11][1];

		 for(int i = 1; i <=10; i++) {
			 cow[i][0] = -1;
		 }
		 int cnt = 0;
		 while(n-- > 0 ) {
			 StringTokenizer  st = new StringTokenizer(br.readLine());
			 int no = Integer.parseInt(st.nextToken());
			 int direction = Integer.parseInt(st.nextToken());
			 
			 if(cow[no][0] == -1) {
				 cow[no][0] = direction;
			 }
			 
			 if(cow[no][0] != direction) {
				 cow[no][0] = direction;
				 cnt ++;
			 }
		 }
		
		 System.out.println(cnt);
		
	}

}

	
	


