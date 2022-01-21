package chap10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11729 {
	static int count =0 ;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		hanoi(num, 1, 2, 3);
		
		System.out.println(count);
		System.out.println(sb);
		
	}

	private static void hanoi(int num, int start, int m ,int to) {
		if(num == 1) {
			count++;
			sb.append(start + " "+ to + "\n");
			return;
		}
		
		hanoi(num-1, start, to, m);
		count ++;
		sb.append(start + " " + to + "\n");
		
		hanoi(num-1, m, start, to);
	}


	

	
	
	
}