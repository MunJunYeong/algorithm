package chap9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
	
	static boolean prime[];
	
	public static void main(String[] args) throws IOException   {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int a= Integer.parseInt(st.nextToken());
		int b= Integer.parseInt(st.nextToken());
		br.close();
		
		prime= new boolean[b+1];
		makePrime();
		
		for(int i =a; i <= b; i++) {
			if(!prime[i]) {
				System.out.println(i);
			}
		}
		
	}

	private static void makePrime() {
		prime[0] = prime[1] = true;
		for(int i=2; i<= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i*i; j< prime.length; j+=i) {
				prime[j] = true;
			}
		}
		
		
		
	}

	
	
}