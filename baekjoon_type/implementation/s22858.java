package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;




public class s22858 {
	
	static int n, k;
	static int[] s;
	static int[] d;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		s = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i <= n; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		
		d = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1 ; i <= n; i++) {
			d[i] = Integer.parseInt(st.nextToken());
		}
		
		int p[] = new int[n+1];
		while(k-- > 0) {
			for(int i = 1; i <= n; i++){
				p[d[i]] = s[i];
			}
			for(int i = 1; i <= n; i++){
				s[i] = p[i];
			}
			
		}
		for(int i = 1; i <= n; i++){
			System.out.print(p[i] + " ");
		}
	}
}

	
	

