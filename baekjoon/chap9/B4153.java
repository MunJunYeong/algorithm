package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B4153 {
	
	static boolean prime[];
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			int num[] = new int[3];
			for(int i = 0 ; i < 3; i ++) {
				num[i] = Integer.parseInt(st.nextToken());
				
			}
			if(num[0] == 0) {
				break;
			}
			Arrays.sort(num);
			int a2 = num[0] * num[0];
			int b2 = num[1] * num[1];
			int c2 = num[2] * num[2];
			if(a2+b2 == c2) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}
		
		
	}

	
	
	
}