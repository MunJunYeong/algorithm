package greedy_one;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a6 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, "-");
		
		String s1[] = new String[st.countTokens()];
		for(int i = 0; i < s1.length; i++) {
			s1[i] = st.nextToken();
		}
		
		int sum = 0;
		StringTokenizer temp1 = new StringTokenizer(s1[0], "+");
		while(temp1.hasMoreTokens()) {
			sum += Integer.parseInt(temp1.nextToken());
		}
		
		for(int i = 1 ; i < s1.length; i ++) {
			StringTokenizer temp = new StringTokenizer(s1[i], "+");
			int minus = 0;
			while(temp.hasMoreTokens()) {
				minus  += Integer.parseInt(temp.nextToken());
			}
			
			sum = sum - minus;
		}
		
		System.out.println(sum);
	}
}

