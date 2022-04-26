package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class g14719 {
	
	static int height, width;
	static int map[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		height = Integer.parseInt(st.nextToken());
		width = Integer.parseInt(st.nextToken());
		
		map = new int[width];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < width; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		
		int ans = 0;
		for(int i = 1; i < width-1; i++) {
			int left = 0;
			int right = 0;
			
			for(int j = 0; j < i; j++) {
				left = Math.max(map[j], left);
			}
			for(int j = i+1; j < width;j ++) {
				right = Math.max(map[j], right);
			}
			
			if(map[i] < left && map[i] < right) {
				ans += Math.min(left, right) - map[i];
			}
		}
		System.out.println(ans);
	}
		
}