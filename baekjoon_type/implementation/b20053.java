package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//arrays.sort 보다 빠름 
public class b20053 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		while (test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int temp = Integer.parseInt(st.nextToken());
			int min = temp;
			int max = temp;
			for(int i =1; i < n; i++) {
				int temp2 = Integer.parseInt(st.nextToken());
				if(min > temp2) {
					min = temp2;
				}
				if(max < temp2) {
					max = temp2;
				}
				
			}
			System.out.println(min + " "+ max);
			
		}
		
		
	}
	
}

	
	

