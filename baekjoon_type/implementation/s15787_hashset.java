package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class s15787_hashset {
	
	static int n, m;
	static int[][] arr;
	static int[][] train;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		train = new int[n+1][21];
		
		for(int i = 1; i < n+1; i ++) {
			for(int j=1; j < 21; j++) {
				train[i][j]= 0;
			}
		}
		
		
		
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int trainNo = Integer.parseInt(st.nextToken());
			int seatNo;
			switch(o) {
			case 1 :
				seatNo = Integer.parseInt(st.nextToken());
				if(train[trainNo][seatNo] == 0) {
					train[trainNo][seatNo] = 1;
				}
				break;
				
			case 2 :
				seatNo = Integer.parseInt(st.nextToken());
				if(train[trainNo][seatNo] == 1) {
					train[trainNo][seatNo] = 0;
				}
				break;
				
			case 3 :
				//좌석을 +1씩 뒤로 간다 
				for(int i = 20; i >1 ; i--) {
					train[trainNo][i] = train[trainNo][i-1];
				}
				train[trainNo][1] = 0;
				
				break;
				
			case 4 :
				for(int i = 1; i < 20; i++) {
					train[trainNo][i] = train[trainNo][i+1];
				}
				train[trainNo][20] = 0;
				break;
				
			}
		}
		Set<String> set = new HashSet<>();
		for(int i = 1; i < n+1; i++) {
			set.add(Arrays.toString(train[i]));
		}
		System.out.println(set.size());
		
		
	}
}