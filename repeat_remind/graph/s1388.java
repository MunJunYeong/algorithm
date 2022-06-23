package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class s1388 {
	
	static int n;
	static int m;
	static Character[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new Character[n][m];
		for(int i = 0; i < n;i++) {
			String s = br.readLine();
			for(int j = 0; j< m; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			int temp = 0;
			for(int j = 0; j < m; j++) {
				if(arr[i][j] == '|') {
					temp = 0;
				}else if(temp == 0) {
					temp++;
					cnt++;
				}
			}
		}
		for(int j = 0; j < m; j++) {
			int temp = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i][j] == '-') {
					temp = 0;
				}else if(temp == 0) {
					temp++;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}