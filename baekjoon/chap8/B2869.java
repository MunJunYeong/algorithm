package chap8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2869 {
	public static void main(String[] args) throws IOException    {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());

		int day = (height-down) / (up - down);
		if((height-down) % (up-down) != 0) {
			day ++;
		}
		
		
		System.out.println(day);
	}
}