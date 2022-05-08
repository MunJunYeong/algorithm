package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Player implements Comparable<Player>{
	int num;
	int score;
	public Player(int n, int s) {
		this.num = n;
		this.score = s;
	}
	
	@Override
	public int compareTo(Player o) {
		int res = o.score - this.score;
		if(res == 0) res = this.num - o.num;
		return res;
	}
	
}

public class s5766 {
	
	static int n ;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if(n == 0 && m == 0) {
				break;
			}
			
			Player arr[]= new Player[10001];
			
			for(int i = 0; i < 10001; i++) {
				arr[i] = new Player(i, 0);
			}
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j =0 ; j < m; j++) {
					int num = Integer.parseInt(st.nextToken());
					arr[num].score++;
				}
			}
			Arrays.sort(arr);
			int second = arr[1].score;
			for(int i = 1; i < 10001; i++) {
				if(arr[i].score == second) {
					System.out.print(arr[i].num + " ");
				}
			}
			System.out.println();
		}
	}

}