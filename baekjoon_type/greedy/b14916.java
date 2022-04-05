package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class b14916 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		//2 5  
		int cnt = 0;
		if(n==1 || n == 3 ) {
			cnt = -1;
		}else {
			if(n % 5 == 0) {
				cnt = n /5;
			}else {
				//n을 5로 나눈 나머지가 홀수일 경우에는 
				int nmg = n % 5;
				if(nmg %2 ==0) {
					int mok = n/5;
					int temp = n- (5*mok);
					int ans = temp/2;
					cnt = mok+ans;
				}else {
					int mok = (n/5) -1;
					int temp = n - (5*mok);
					int ans = temp/2;
					cnt = mok + ans;
				}
				
			}
		}
		System.out.println(cnt);
		/*	
		2-1
		4-2
		5-1
		6-3
		7-2
		8-4
		
		*/
		
	}
	
}

	
	

