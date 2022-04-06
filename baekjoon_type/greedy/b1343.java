package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b1343 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int cnt = 0;
		StringBuilder sb =  new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '.') {
				if(cnt % 2 == 1) {
					System.out.println(-1);
					System.exit(0);
					break;
				}
				
				while(cnt != 0) {
					if(cnt >= 4) {
						sb.append("AAAA");
						cnt = cnt-4;
					}else {
						sb.append("BB");
						cnt = cnt-2;
					}
				}
				sb.append(c);
				
			}else {
				cnt ++;
			}
		}
		if(cnt > 0) {
			if(cnt %2 != 0) {
				System.out.println(-1);
				System.exit(0);
			}else {
				while(cnt != 0) {
					if(cnt >= 4) {
						sb.append("AAAA");
						cnt = cnt-4;
					}else {
						sb.append("BB");
						cnt = cnt-2;
					}
				}
				
			}
		}
		System.out.println(sb);
	}
	
}

	
	

