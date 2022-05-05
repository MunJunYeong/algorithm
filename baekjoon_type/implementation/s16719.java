package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class s16719 {
	
	static char[] s;
	static boolean [] visit;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		s = br.readLine().toCharArray();
		visit = new boolean[s.length];
		
		find(0, s.length);
		
		
	}


	private static void find(int start, int len) {
		int idx = -1;
		int min = Integer.MAX_VALUE;
		
		for(int i = start; i < len; i++) {
			if(min > s[i] && !visit[i]) {
				min = s[i];
				idx = i;
			}
		}
		if(idx != -1) {
			visit[idx] = true;
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < s.length; i ++) {
				if(visit[i]) {
					sb.append(s[i]);
				}
			}
			System.out.println(sb.toString());
			
			find(idx, len);
			
			find(start, idx);
		}
		
		
	}

}
