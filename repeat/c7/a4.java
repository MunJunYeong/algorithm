package c7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a4 {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int num = Integer.parseInt(br.readLine());
		for(int i =0; i < num; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			int n = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < n; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
		
		
		
	}

}
