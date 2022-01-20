package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer zero = new StringTokenizer(str, "1"); // 0을 가져
		StringTokenizer one = new StringTokenizer(str, "0"); // 1을 가져
		
		int zeroCnt = zero.countTokens();
		int oneCnt = one.countTokens();
		if(zeroCnt > oneCnt) {
			System.out.println(oneCnt);
		}else {
			System.out.println(zeroCnt);
		}
		
		
	}
}
