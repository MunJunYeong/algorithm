package c8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a3 {
	
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int cross = 1;
		int sum = 0;
		
		while(true) {
			if(num <= sum + cross) {
				if(cross % 2 == 1) {
					System.out.println((cross - (num-sum-1)) + "/" + (num-sum));
					break;
				}else {
					System.out.println( (num-sum) + "/" + (cross - (num-sum-1))  );
					break;
				}
			}else {
				sum = sum + cross;
				cross++;
			}
		}
		
		
	}
	
	
}


