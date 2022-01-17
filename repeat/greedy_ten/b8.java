package greedy_ten;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b8 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringTokenizer zeroSt = new StringTokenizer(s, "1");
		StringTokenizer oneSt = new StringTokenizer(s, "0");
		long zero = zeroSt.countTokens();
		long one = oneSt.countTokens();
		
		if(zero > one ) {
			System.out.println(one);
		}else 
			System.out.println(zero);
		
	}
}
