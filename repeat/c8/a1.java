package c8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1 {
	public static void main(String[] args) throws IOException   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int total = Integer.parseInt(st.nextToken());
		int one = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());

		
		int temp = price - one;
		if(one >= price) {
			System.out.println(-1);
		}else {
			System.out.println(total/temp +1);
		}
		
	}
}
