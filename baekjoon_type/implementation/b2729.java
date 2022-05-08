package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class b2729 {
	
	static int n ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(n-- > 0) {
			st = new StringTokenizer(br.readLine());
			String a1 = st.nextToken();
			String b1= st.nextToken();
			
			BigInteger a = new BigInteger(a1, 2);
			BigInteger b = new BigInteger(b1, 2);
			
			BigInteger sum = a.add(b);
			
			System.out.println(sum.toString(2));
			
		}
	}

}
