package greedy_ten;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b7 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			int total = Integer.parseInt(st.nextToken());
			if(day == 0) {
				break;
			}
			int res = (total/p) * day;
			int nmg = total%p;
			if(nmg > day) {
				res = day + ((total/p)*day);
			}else {
				res = nmg + ((total/p)*day);
			}
			
			System.out.println("Case "+ cnt+ ": " + res);
			cnt ++;
		}
		
		
	}
}
