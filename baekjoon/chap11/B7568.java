package chap11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B7568 {
	
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[num][2];

		for(int i =0; i<num; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			int kg = Integer.parseInt(st.nextToken());
			int height = Integer.parseInt(st.nextToken());
			arr[i][0] = kg;
			arr[i][1] = height;
		}
		
		for(int i =0; i < num; i++) {
			int rank = 1;
			
			for(int j = 0; j< num; j++) {
				if(i == j) continue;
				
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank ++;
				}
				
			}
			System.out.print(rank + " ");
			
		}
		

	}

	
}

