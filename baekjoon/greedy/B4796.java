package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4796 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()); // l일 동안 
			int p = Integer.parseInt(st.nextToken()); // 연속 p일 중 
			int vacation = Integer.parseInt(st.nextToken()); // v일 휴가 
			if(l == 0) {
				break;
			}
			int value = (vacation/p) * l;
			int els = vacation%p;
			int ans = value;
			if(l >= els) { //일수가 나머지보다 크다면  ! 
				ans += els;
			}else {
				ans += l;
			}
			
			System.out.println("Case " + count + ": " + ans);
			count ++;
			
		}
	}
}
