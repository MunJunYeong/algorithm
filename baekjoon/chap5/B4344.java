package chap5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String a[] = new String[num];
		
		for(int i = 0; i < num; i++) {
			a[i] = br.readLine();
			StringTokenizer st = new StringTokenizer(a[i]);
			
			int b = Integer.parseInt(st.nextToken()); 
			int temp[] = new int[b];
			float sum = 0;
			int tempCount = 0;
			
			while(st.hasMoreTokens()) {
				temp[tempCount] = Integer.parseInt(st.nextToken());
				sum += temp[tempCount];
				tempCount++;
			}
			float avg = sum/b;
			float cnt = 0;
			
			for(int j = 0; j < b; j++) {
				if(temp[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%%n", cnt/b*100);
		}
		
	}
}
